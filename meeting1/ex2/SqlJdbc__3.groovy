package meeting1.ex2

def EMPLOYEE  = "TBL_EMPLOYEE"
def NAME     = "C_NAME"
def LASTNAME = "C_LASTNAME"

def TEAM     = "TEAM"
def TEAMID   = "PK_TEAM_ID"

def SQL = """
    SELECT   $NAME
      FROM   $EMPLOYEE
     WHERE   $NAME = '?'
       AND   $LASTNAME ='?'
       AND   $TEAMID IN (
             SELECT $TEAMID
               FROM $TEAM
             )
"""

println SQL
