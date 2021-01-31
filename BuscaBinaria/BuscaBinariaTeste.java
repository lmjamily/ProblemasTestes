import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Test;

public class BuscaBinariaTeste {
@Test
public void numeroExistenteInicio (){
    int[] array = {2, 4, 8, 16, 32};
    int chave = 2 ;

    BuscaBinaria bsc = new BuscaBinaria();
    assertEquals(0, bsc.busca(array, chave));
}
@Test
public void numeroExistenteFinal (){
    int[] array = {0, 5, 10, 15, 20};
    int chave = 20;

    BuscaBinaria bsc = new BuscaBinaria();
    assertEquals(4, bsc.busca(array, chave));
}

@Test
public void numeroExistenteMeio (){
    int[] array = {7, 31, 54, 79, 98, 108, 115};
    int chave = 79;

    BuscaBinaria bsc = new BuscaBinaria();
    assertEquals(3, bsc.busca(array, chave));

}
@Test
public void numeroInexistente (){
    int[] array = {5, 7, 9, 11, 13, 15, 17, 19};
    int chave = 10;

    BuscaBinaria bsc = new BuscaBinaria();
    assertEquals(-1, bsc.busca(array, chave));
}

@Test
public void numerosRepetidos (){
    int[] array = {1, 5, 5, 6, 8};
    int chave = 5;

    BuscaBinaria bsc = new BuscaBinaria();
    assertEquals(2, bsc.busca(array, chave));
}

}
