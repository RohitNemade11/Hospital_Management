let express=require("express");
let bodyparser=require("body-parser");
let session=require("express-session");
let app=express();

// Import database connection
require('./config/db');
const mainRoutes = require('./routes/routes.js');
app.use('/', mainRoutes);

const adminRouter = require('./routes/routes.js');
app.use('/admin', adminRouter);

app.use(bodyparser.urlencoded({extended:true}));
app.use(bodyparser.json());
app.use(session({
    secret:'11111111fdf',
    resave:false,
    saveUninitialized:false

}))


app.set('view engine','ejs');
app.use(express.static("public"));

module.exports=app;