//{ Driver Code Starts
// Initial Template for javascript

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => { inputString += inputStdin; });

process.stdin.on('end', _ => {
    inputString =
        inputString.trim().split('\n').map(string => { return string.trim(); });

    main();
});

function readLine() { return inputString[currentLine++]; }

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for (; i < t; i++) {
        let N = parseInt(readLine()), M = parseInt(readLine());
        let obj = new Solution();
        let res = obj.closestNumber(N, M);
        if (res === -0) res = 0;
        console.log(res);

        console.log("~");
    }
}

// } Driver Code Ends


// User function Template for javascript

/**
 * @param {number} n
 * @param {number} m
 * @return {number}
 */

class Solution {

    closestNumber(n, m) {

        // code here
        const q = parseInt(n / m);
        const n1 = q * m;
        const n2 = (n * m) > 0 ? (q + 1) * m : (q - 1) * m;
        
        if(Math.abs(n - n1) < Math.abs(n - n2)) return n1;
        
        return n2;
    }
}