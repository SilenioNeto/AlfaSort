// Bubble sort
public class BubbleSortAlfabetico{
    public static void main(String[] args) {
        String aux;
        String[] name ={
            "GABRIEL ARAUJO DE SOUZA", "EMILLY BEATRIZ PALMEIRA BACELAR SANTOS", "FILIPE BONFIM DE CERQUEIRA", "MARIA CLARA SANTOS CAMERA", "LAILA COUTINHO SANTOS PEREIRA", "NILSON DE OLIVEIRA ARGOLO JUNIOR", "GABRIEL DE SOUZA OLIVEIRA GUIMARAES CUNHA", "MARIA EDUARDA PAMPONET RAMALHO", "ATILA ESQUIVEL MACEDO", "JOAO FABIO ARGOLO DE ALMEIDA JUNIOR", "YAN FERNANDES DE SANTA BARBARA", "FABIO HAIALA SOUZA DO NASCIMENTO", "CAUA MARCUS LUCIUS CARDOSO FERNANDES", "IAN MENEZES FERNANDES GUTIERREZ", "PEDRO OLIVEIRA RABELO", "LUCAS QUARIGUAZI DE SENA", "CAIO RIOS ALEXANDRIA", "ROBERTO SILVA NUNES FILHO", "SILENIO VIANA LEITE NETO", "ANTONIO VICTOR DE ALMEIDA PALMA", "JOAO VITOR DE JESUS NERY DOS SANTOS", "PAULO VITOR DE SANTANA SANTOS", "ALBERT ÁLEF SILVA PRAXEDES"
        };
        for(int y= 0; y<name.length; y++){
            for(int x = y+1; x<name.length; x++){
                char cha1 = name[y].charAt(0);
                char cha2 = name[x].charAt(0);
                if(cha1<cha2){
                    aux=name[x];
                    name[x] = name[y];
                    name[y] = aux;
                }
            }
            System.out.println(name[y]);
        }
    }
}

