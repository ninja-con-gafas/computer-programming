givenNumber=input("Enter a natural number");

function isPrime=checkPrime(givenNumber)
  isPrime=1;
  for number=2:givenNumber-1
    if(rem(givenNumber,number)==0)
      isPrime=0;
      break;
    endif
  endfor
endfunction

function listPrime(givenNumber)
  for number=2:givenNumber
    isPrime=checkPrime(number);
    if(isPrime)
      printf("%d ",number);
    endif
    isPrime=false;
  endfor
endfunction
