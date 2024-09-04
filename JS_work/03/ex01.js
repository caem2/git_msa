import readline form 'readline';

const myobj = {
  Input : process.stdin,
  Output : process.stdout
}

const rl = require('readline');

rl.qusetion('숫자입력',res=>{
  console.log(`res = ${res}`);
  rl.close();
})