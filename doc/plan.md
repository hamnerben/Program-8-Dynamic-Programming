# Plan

# Sets

# phase 0/1:

We need to take a number `total` and return / print (which is it?) a list
of all the possible combinations of `int`s that added together, would sum to
`total`.

This needs to be done recursively.


### she provided the following psuedocode
```java
// amt: number of teacups left ot divide
// soFar is the teaset siezes ive alreayd decided to use
// currentSize minimum additional teaset size im considering (helps to make progress)

void printAll(int amt, String soFar, int currentSize)
```

## Brain Storm

it needs to follow a tree of every possibility being considered.
As the recursive calls go down the tree we need to restrict the possibilities considered.

```
     10
     /\
    9  1
   / \  
  8   1
```
that aint it


## Recursive attributes

* end condition: if amt is 0 exit recursion
* use it or not: use full amount, then call on the rest
# Phase 2: design

```java
void printAll(int amt, String soFar, int currentSize){
    if(amt <= 0) {  // if found a finished combo
        print soFar
        exit recursion, 
        }
    if(amt - currentSize < 0){
        // impossible to finish combo with given currentSize
        exit recursion without printing
        }
    // use it 
    printAll(amt - currentSize, sofar + "currentsize", currentSize)
        
    // dont use it
    printAll(amt, soFar, currentSize + 1)
        
        }
```








