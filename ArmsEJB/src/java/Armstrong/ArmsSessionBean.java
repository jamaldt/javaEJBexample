/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armstrong;

import javax.ejb.Stateless;

/**
 *
 * @author cdeltoro
 */
@Stateless
public class ArmsSessionBean implements ArmsSessionBeanRemote {

    @Override
    public Boolean ArmsMethod(int Num) {
        int sum =0,r,temp = Num;
        boolean result = false;
        while (temp!=0)
        {
            r = temp%10;
            sum = sum + r*r*r;
            temp = temp/10;
            
        }
        
        if(Num == sum)
        {
            result = true;
        }
        return (result);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
