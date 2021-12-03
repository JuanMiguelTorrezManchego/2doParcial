using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        int a = 0, b = 1, c = 0, n = 20 ;
        String r = "0 , 1";
        for (int i = 0; i < 20; i++) {
            c = a + b;
            r = r + ", " + c;
            a = b; b = c;
        }
        Label1.Text = r.ToString();
    }
    protected void Button1_Click(object sender, EventArgs e)
    {

    }
}