function printOddEven(n) {
  for(let i = 1; i <= n; i++) {
    if(i % 2 === 0) {
      console.log(i + " is Even");
    } else {
      console.log(i + " is Odd");
    }
  }
}
printOddEven(7);