const express = require('express');
const router = express.Router();
router.get('/', (req, res) => {
    res.render('getStarted');
});

router.get('/admin', (req, res) => {
    res.render('adminLogin');
});

router.post('/admin/login', (req, res) => {
    const { username, password } = req.body;
    if (username === 'admin' && password === 'admin') {
        res.send('Welcome, Admin!');
    } else {
        res.send('Invalid credentials');
    }
});
router.get('/', (req, res) => {
    res.render('admin'); 
});

module.exports = router;
