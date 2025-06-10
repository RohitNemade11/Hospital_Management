const mysql = require('mysql2');

const conn = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '9309108805',
  database: 'mysql'  // Make sure this matches your database name
});

conn.connect((err) => {
  if (err) {
    console.error('Database connection failed: ' + err.stack);
    return;
  }
  console.log('new databse for rushii connected');
});

module.exports = conn;
