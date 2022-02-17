class Main {
    public static void main (String [] args){
        competicao automoveis = new competicao(4);

        moto moto = new moto(0, 24000, "XJ-6", "TVI8R56", 2016, 600);
        carro carro = new carro(0, 299590, "HILUX", "SCP9U22", 2021, 163, 4);
        caminhao caminhao = new caminhao(0, "Volvo FH", "SPC5T62", 2020, 74000, 581978, 12);
        onibus onibus = new onibus(0, 100000, 6, "Rio Tinto", "TRE8G65", 2004, 40);

        automoveis.adicionarVeiculos(moto);
        automoveis.adicionarVeiculos(carro);
        automoveis.adicionarVeiculos(caminhao);
        automoveis.adicionarVeiculos(onibus);

        automoveis.acelerarTodos();
        automoveis.listarTodos();
        automoveis.frearTodos();
    }
}