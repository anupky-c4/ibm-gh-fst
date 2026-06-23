# import json
# import pandas

# with open('currency.json','r') as myfile:
#     data=myfile.read()
# obj=json.loads(data)
# print("usd:"+str(obj['usd']))
# print("eur:"+str(obj['eur']))
# print("gbp:"+str(obj['gbp']))


import pandas as pd

data = pd.read_json('currency.json', orient='index', typ='series')

print("usd:", data['usd'])
print("eur:", data['eur'])
print("gbp:", data['gbp'])