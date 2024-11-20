function allPrimes(n = 5) {
	for (let i = 2; i <= n; i++) {
		// check for each i
		let isPrime = true;
		let div = 2;
		while (div * div <= i) {
			const rem = i % div;
			if (rem === 0) {
				isPrime = false;
				break;
			}
      div++;
		}
		if (isPrime) {
			console.log(i + " is Prime");
		}
	}
}
allPrimes(10);
