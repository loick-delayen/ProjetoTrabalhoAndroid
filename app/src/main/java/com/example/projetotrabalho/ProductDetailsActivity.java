package com.example.projetotrabalho;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        ImageView productImage = findViewById(R.id.productImage);
        TextView productName = findViewById(R.id.productName);
        TextView productPrice = findViewById(R.id.productPrice);
        TextView descriptionTextView = findViewById(R.id.productDescription);

        String name = getIntent().getStringExtra("PRODUCT_NAME");
        String price = getIntent().getStringExtra("PRODUCT_PRICE");
        int imageResource = getIntent().getIntExtra("IMAGE_RESOURCE", 0);
        String productDescription = getProductDescription(name);

        productName.setText(name);
        productPrice.setText(price);
        descriptionTextView.setText(productDescription);
        productImage.setImageResource(imageResource);
    }

    private String getProductDescription(String productName) {
        // Lógica para recuperar a descrição do produto com base no nome
        // Aqui você pode usar um switch, if-else, ou qualquer outra lógica que desejar
        switch (productName) {
            case "Camisa Retrô 1993 Vitória":
                return "Composição: 100% Poliéster \n" +
                        "Escudo: Sublimado \n" +
                        "Gola: Pólo\n" +
                        "Manga: Curta\n" +
                        "Número: 9\n" +
                        "Detalhe: RETRÔ 1993 BRASILEIRÃO \n" +
                        "\n" +
                        "Dimensões Aproximadas (Largura x Altura):\n" +
                        "P: 50 x 71 cm\n" +
                        "M: 52 x 73 cm\n" +
                        "G: 54 x 75 cm\n" +
                        "GG: 60 x 77 cm\n" +
                        "GGG: 64 x 79 cm\n" +
                        "GGGG: 76 X 86 CM";
            case "Camisa Retrô 1999 Vitória":
                return "Composição: 100% Poliéster  \n" +
                        "Escudo: Bordado\n" +
                        "Gola: Pólo V \n" +
                        "Forro: Não\n" +
                        "Manga: Curta\n" +
                        "Patrocínios: Sublimado\n" +
                        "Número: 10\n" +
                        "Listras: -\n" +
                        "Detalhe: RETRÔ 1999\n" +
                        "\n" +
                        "Dimensões Aproximadas (Largura x Altura):\n" +
                        "P: 52 x 71 cm\n" +
                        "M: 54 x 74 cm\n" +
                        "G: 56 x 75 cm\n" +
                        "GG: 58 x 77 cm\n" +
                        "GGG: 65 x 81 cm\n" +
                        "GGGG: 74 X 84 CM";
            case "Camisa Retrô 1997 Vitória":
                return "Composição: 100% Poliéster \n" +
                        "Escudo: Sublimado \n" +
                        "Gola: Pólo\n" +
                        "Manga: Curta\n" +
                        "Número: 9\n" +
                        "Detalhe: RETRÔ 1993 BRASILEIRÃO \n" +
                        "\n" +
                        "Dimensões Aproximadas (Largura x Altura):\n" +
                        "P: 50 x 71 cm\n" +
                        "M: 52 x 73 cm\n" +
                        "G: 54 x 75 cm\n" +
                        "GG: 60 x 77 cm\n" +
                        "GGG: 64 x 79 cm\n" +
                        "GGGG: 76 X 86 CM";
            case "Camisa Raizes 2013 Vitória":
                return "A camisa do Vitória Raízes 2013 foi apresentada pela Penalty nesta sexta-feira (19/7). O novo manto do Vitória foi inspirado no primeiro uniforme utilizado pelo clube baiano. Fundado em 1899 com o nome de Club de Cricket Victória, a agremiação iniciou a pratica do futebol somente em 1902 com uma camisa listrada em preto e branco, que antecedeu o tradicional rubro-negro que prevalece até os dias de hoje.\n" +
                        "\n" +
                        "A nova terceira camisa do Vitória também serviu para relembrar a campanha “Meu Sangue é Rubro-negro”, seguindo a ideia da torcida, que pedia uma camisa branca e preta para ser o uniforme 3 deste ano.";
            case "Camisa 2024 Vitória":
                return "O novo uniforme conta com a tecnologia do tecido Dry Ray, presente nos modelos desenvolvidos pela Volt Sport, com a composição feita em 100% poliéster e proteção contra raios solares e propriedades térmicas, além de também ter recortes nos ombros e nas laterais, o escudo em tpu bordado, o ano de fundação da equipe (1899) bordado na lateral, e um plotter do escudo da equipe com a frase “Sangue Vermelho, pele Preta” na parte inferior.";
            case "Camisa 2023 Vitória":
                return "Dimensões aproximadas (A x L)\n" +
                        "\n" +
                        "P: 69 x 47\n" +
                        "M: 72 x 50\n" +
                        "G: 75 x 53\n" +
                        "GG: 81 x 59\n" +
                        "3G: 82 x 62\n" +
                        "4G: 83 x 65\n" +
                        "5G: 84 x 68\n" +
                        "6G: 85 x 71\n" +
                        "7G: 86 x 74\n" +
                        "8G: 87 x 77";
            default:
                return "";
        }
    }
}
