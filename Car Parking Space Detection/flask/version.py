import flask
import ibm_db


app=Flask(__name__)
app.secret_key='a'

conn=ibm_db.connect("DATABASE=bludb;H0STNAME=9938aec0-8105-433e-8bf9-0fbb7e483086.c1ogj3sd0tgtu0lqde00.databases.appdomain.cloud;PORT=32459;SECURITY=SSL;SSLServerCertificate=DigiCertGlobalRootCA.crt;UID=cml74727;PWD=RWIJxErBd2DBCqHT;","","")
print("connected")