# JavaDSAPractice
Java DS &amp; A Practice

# DS:
Linear:
src.com.wassupchicken.dsalgo.array.Array, Linked List, Stack, Queue


Non-Linear:
Tree, Graph

# Rules of Big O NOtation
- Single Processor
- Performs Sequential Exeuction of Statements
- Assignment operation takes 1 UOT
- Return statement takes 1 UOT
- Arithmetical op takes 1 UOT
- Logical op takes 1 UOT
- Other small/single ops take 1 UOT
- Accessing takes 1 UOT

# Calculation:
- Drop lower order terms
  - Ex. T = n^2 + 3n + 1 ==> O(n^2)
- Drop Constant Multipliers
  - Ex. 3n^2 + 6n + 1 ==> O(n^2)




Big O Notation:

# Constant

public int sum(int x, int y) 

{
int reuslt = xy + y;


return result;
}


1 + 1 + 1 + 1 = 4

1 + 1 = 2


//regardless of input size, time taken is constant

T ~ C (constant)
TC = O(1);


# Linear

public int sum(int x, int y)

{

int sum = 0;

for (int i = 1 ; i <=n i++) 
{
    
sum = sum + i

}


return result;

}

T = 1 + 6n + 4 + 4n + 2

T = 10n + 7

C ~ O(n)

# Polynomial

nested for loops;

C ~ O(n^2);

