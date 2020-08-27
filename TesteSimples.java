class TesteSimples{

  public void executar(){

    Atleta atleta = new Atleta();
    atleta.setNome("Maria");
    atleta.setIdade(55);

    System.out.println("Nome : "+ atleta.getNome()+"\n" +"Idade : "+ atleta.getIdade());

  }

}