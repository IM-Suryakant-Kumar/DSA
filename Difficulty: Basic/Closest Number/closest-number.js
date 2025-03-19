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
        let closest = 0, minDiff = Infinity;
    
        for(let i = n - Math.abs(m); i <= n + Math.abs(m); i++) {
            if(i % m === 0) {
                let diff = Math.abs(n - i);
                
                if(diff < minDiff || (diff === minDiff && Math.abs(i) > Math.abs(closest))) {
                    closest = i;
                    minDiff = diff;
                }
            }
        }
        
        return closest;
    }
}