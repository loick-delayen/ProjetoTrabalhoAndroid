package com.example.projetotrabalho;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projetotrabalho.model.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class TelaCadastro extends AppCompatActivity {

    Usuario usuario; // Objeto Usuario que armazena as informações do usuário
    FirebaseAuth autenticacao; // Objeto FirebaseAuth para autenticação com Firebase
    EditText campoNome, campoEmail, camposSnha; // Campos de entrada para nome, email e senha

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tela_cadastro); // Define o layout da atividade
        inicializar(); // Inicializa os elementos da interface
    }

    // Inicializa os elementos da interface com seus respectivos IDs
    public void inicializar() {
        campoNome = findViewById(R.id.editTextNome);
        campoEmail = findViewById(R.id.TextLogin);
        camposSnha = findViewById(R.id.textSenha);
    }

    // Valida os campos de entrada e, se válidos, chama o método para cadastrar o usuário
    public void validarCampos(View view) {
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        String pass = camposSnha.getText().toString();

        if (!nome.isEmpty()) { // Verifica se o campo nome não está vazio
            if (!email.isEmpty()) { // Verifica se o campo email não está vazio
                if (!pass.isEmpty()) { // Verifica se o campo senha não está vazio

                    usuario = new Usuario(); // Cria um novo objeto Usuario
                    usuario.setNome(nome); // Define o nome do usuário
                    usuario.setEmail(email); // Define o email do usuário
                    usuario.setPass(pass); // Define a senha do usuário

                    // Chama o método para cadastrar o usuário
                    cadastrarUsuario();

                } else {
                    Toast.makeText(this, "Preencha a senha", Toast.LENGTH_SHORT).show(); // Exibe mensagem se o campo senha estiver vazio
                }
            } else {
                Toast.makeText(this, "Preencha o email", Toast.LENGTH_SHORT).show(); // Exibe mensagem se o campo email estiver vazio
            }
        } else {
            Toast.makeText(this, "Preencha o nome", Toast.LENGTH_SHORT).show(); // Exibe mensagem se o campo nome estiver vazio
        }
    }

    // Método para cadastrar o usuário utilizando Firebase Authentication
    private void cadastrarUsuario() {
        autenticacao = FirebaseAuth.getInstance(); // Obtém instância de autenticação do Firebase

        autenticacao.createUserWithEmailAndPassword(
                usuario.getEmail(), usuario.getPass()
        ).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(TelaCadastro.this, "Sucesso ao Cadastrar o usuario", Toast.LENGTH_SHORT).show(); // Exibe mensagem de sucesso
                }else{
                    Toast.makeText(TelaCadastro.this, "Falha ao cadastrar o usuario!", Toast.LENGTH_SHORT).show(); // Exibe mensagem de erro
                }
            }
        });
    }
}
