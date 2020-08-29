const express = require("express")

const cors = require('cors')
const app = express();

app.use((req,res,next) => {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Methods", 'GET,PUT,POST,DELETE');
    app.use(cors());
    next();
});

app.use(express.static('src'))

app.get("/", function(req,res){
    res.sendFile(__dirname + "/src/index.html");
});

app.listen(8081);

