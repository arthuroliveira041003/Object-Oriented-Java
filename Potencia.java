public class Potencia {
    int Quadrado(int q){
        return q * q;
    }

    int Cubo(int c){
        return c * c * c;
    }

    public static void main(String[] args) {
        Potencia p  = new Potencia();
        //entrada = 4, resultado esperado: quadrado = 16, cubo = 64
        int Entrada = 4;
        int ResultadoEsperadoQuadrado = 16;
        int ResultadoEsperadoCubo = 64;

        System.out.println("inicio dos testes!");

        if(ResultadoEsperadoQuadrado != p.Quadrado(Entrada)){
            System.out.println("quadrado não passou no teste!");
        }

        if(ResultadoEsperadoCubo != p.Cubo(Entrada)){
            System.out.println("cubo não passou no teste!");
        }

        System.out.println("Fim dos testes!");

    }
}
