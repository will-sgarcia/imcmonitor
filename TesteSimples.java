class TesteSimples{

  public void executar(){

    Atleta atleta = new Atleta();
    atleta.setNome("William");
    atleta.setIdade(25);

    System.out.println("Nome = "+ atleta.getNome());
    System.out.println("Idade = "+ atleta.getIdade());

  }

}