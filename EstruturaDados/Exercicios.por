programa {
  funcao CriarDivisao(){
    escreva("\n")
    escreva("====================")
    escreva("\n")
  }

  funcao inicio() {
    inteiro vetor[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}
    inteiro n = 15
    inteiro x = 7
    escreva("O número de números maiores do que ", x, " é igual a ",ContaMaiores(vetor, n,x))
    CriarDivisao()
    escreva("A soma dos elementos até encontrar um número menor que ", x, " é igual a ",SomaArray(vetor, n,x))
    CriarDivisao()
    escreva("A quantidade de números pares no Array é igual a ", ParesNoArray(vetor, n))
    CriarDivisao()
    MultiplicaValor(3,918)
    CriarDivisao()
    ArrayInvertido(vetor,n)
  }

  funcao inteiro ContaMaiores(inteiro a[],inteiro n, inteiro x){ //Ex01
    inteiro c = 0 //Contagem de números maiores do que x
    para(inteiro i=0;i<n;i++){
      se(a[i] > x){
        c++
      }
    }
    retorne(c)
  }

  funcao inteiro SomaArray(inteiro a[],inteiro n, inteiro x){ //Ex02
    logico menor = falso
    inteiro i = 0
    inteiro contagem = 0
    enquanto(menor == falso e i <n){
        se(a[i] < x){
          menor = verdadeiro
        }
        senao{
          contagem++
          i++
        }
        
    }
    retorne contagem
  }

  funcao inteiro ParesNoArray(inteiro a[],inteiro n){ //Ex03
    inteiro contagem = 0
    para(inteiro i = 0; i<n; i++){
      se(a[i]%2 == 0){
        contagem++
      }
    }
      retorne contagem
  }

  funcao MultiplicaValor(inteiro x,inteiro max){ //Ex04
    inteiro qtd = 0
    inteiro y = x
    enquanto(x < max){
      x*=2
      qtd++
    }
    escreva("O número ", y, " foi multiplicado ", qtd, " vezes, resultando em ", x)
  }

  funcao inteiro MenorValor(inteiro a[], inteiro n){
    inteiro menor = a[0]
    para(inteiro i = 0; i<n; i++){
      se(a[i] < menor){
        menor = a[i]
      }
    }
    retorne menor
  }

  funcao ArrayInvertido(inteiro a[], inteiro n){
    inteiro invertido[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
    inteiro j = 0
    para(inteiro i=n-1;i>=0;i--){
      invertido[j] = a[i]
      j++
    }
    escreva(invertido)
  }
}
