package test1;


import java.io.*;

public class test1 {
    public static void main(String[] args) throws Exception {

        double VTes = 1;
        double Test = 1;
        double VDev = 1;
        double SDev = 1;
        double Dev = 1;
        double An = 1;
        double act1 = 163*VTes+551.5*Test+246.75*VDev+453.75*SDev+337.75*Dev+385*An;
        double act2 = 96*VTes+376*Test+246.75*VDev+473*SDev+485*Dev+528*An;
        double act3 = 429.75*VTes+844.25*Test+495.25*VDev+1932*SDev+1875*Dev+504*An;
        double act4 = 404*VTes+884*Test+567.0*VDev+843.5*SDev+717.5*Dev+505*An;
        double rAct1 = 1444771.40;
        double rAct2 = 1555375;
        double rAct3 = 4438292.5;
        double rAct4 = 2830100;

        An = rAct1/385 - 163.0/385*VTes-551.5/385*Test-246.75/385*VDev-453.75/385*SDev-337.75/385*Dev;
//        System.out.println(An);
        double anrAct1 = rAct1/385.0;
        double anVTes = 163.0/385.0;
        double anTest = 551.5/385.0;
        double anVDev = 246.75/385.0;
        double anSDev = 453.75/385.0;
        double anDev = 337.75/385.0;
        An = anrAct1 - anVTes*VTes-anTest*Test-anVDev*VDev-anSDev*SDev-anDev*Dev;
//        System.out.println(An);
//        System.out.println((anrAct1 - anVTes*VTes-anTest*Test-anVDev*VDev-anSDev*SDev-anDev*Dev));


        Dev = (rAct2 - 96*VTes-376*Test-246.75*VDev-473*SDev-528*An)/485;
//        System.out.println(Dev);
        Dev = rAct2/485 - 96.0/485*VTes - 376.0/485*Test - 246.75/485*VDev - 473.0/485*SDev   - 528.0/485*An;
//        System.out.println(Dev);
        Dev = 1;
        Dev = rAct2/485 + (528.0/485*anVTes-96.0/485)*VTes + (528.0/485*anTest - 376.0/485)*Test + (528.0/485*anVDev - 246.75/485)*VDev
                + (528.0/485*anSDev- 473.0/485)*SDev   - 528.0/485*anrAct1
                  + 528.0/485*anDev*Dev;
        Dev = 1;
        Dev = (rAct2/485 + (528.0/485*anVTes-96.0/485)*VTes + (528.0/485*anTest - 376.0/485)*Test + (528.0/485*anVDev - 246.75/485)*VDev
                + (528.0/485*anSDev- 473.0/485)*SDev   - 528.0/485*anrAct1)/(1 - 528.0/485*anDev);

//        System.out.println(Dev);

        double devrAct2 = (rAct2/485 - 528.0/485*anrAct1)/(1 - 528.0/485*anDev);
        double devVTes = (528.0/485*anVTes-96.0/485)/(1 - 528.0/485*anDev);
        double devTest = (528.0/485*anTest - 376.0/485)/(1 - 528.0/485*anDev);
        double devVDev = (528.0/485*anVDev - 246.75/485)/(1 - 528.0/485*anDev);
        double devSDev = (528.0/485*anSDev- 473.0/485)/(1 - 528.0/485*anDev);

        Dev = devrAct2 + devVTes*VTes + devTest*Test + devVDev*VDev + devSDev*SDev;

//        System.out.println(Dev);


        SDev = (rAct3-429.75*VTes-844.25*Test-495.25*VDev-1875.0*Dev-504*An)/1932.0;
//        System.out.println(SDev);
        SDev = rAct3/1932-429.75/1932*VTes-844.25/1932*Test-495.25/1932*VDev-1875.0/1932*Dev-504.0/1932*An;
//        System.out.println(SDev);
        SDev = 1;
        SDev = rAct3/1932-429.75/1932*VTes-844.25/1932*Test-495.25/1932*VDev
                -1875.0/1932*(devrAct2 + devVTes*VTes + devTest*Test + devVDev*VDev + devSDev*SDev)
                -504.0/1932*(anrAct1 - anVTes*VTes-anTest*Test-anVDev*VDev-anSDev*SDev-anDev*(devrAct2 + devVTes*VTes + devTest*Test + devVDev*VDev + devSDev*SDev));

//        System.out.println(SDev);

        SDev = (rAct3/1932.0 - 1875.0/1932*devrAct2 - 504.0/1932*anrAct1 + 504.0/1932*anDev*devrAct2)
                +(-429.75/1932.0 - 1875.0/1932*devVTes + 504.0/1932*anVTes + 504.0/1932*anDev*devVTes)*VTes
                +(-844.25/1932.0 - 1875.0/1932*devTest + 504.0/1932*anTest + 504.0/1932*anDev*devTest)*Test
                +(-495.25/1932.0 - 1875.0/1932*devVDev + 504.0/1932*anVDev + 504.0/1932*anDev*devVDev)*VDev;

//        System.out.println(SDev);

        SDev = ((rAct3/1932.0 - 1875.0/1932*devrAct2 - 504.0/1932*anrAct1 + 504.0/1932*anDev*devrAct2)
                +(-429.75/1932.0 - 1875.0/1932*devVTes + 504.0/1932*anVTes + 504.0/1932*anDev*devVTes)*VTes
                +(-844.25/1932.0 - 1875.0/1932*devTest + 504.0/1932*anTest + 504.0/1932*anDev*devTest)*Test
                +(-495.25/1932.0 - 1875.0/1932*devVDev + 504.0/1932*anVDev + 504.0/1932*anDev*devVDev)*VDev)/(1.0-(-1875.0/1932*devSDev + 504.0/1932*anSDev + 504.0/1932*anDev*devSDev));

//        System.out.println(SDev);

        double sdevrAct3 = (rAct3/1932.0 - 1875.0/1932.0*devrAct2 - 504.0/1932.0*anrAct1 + 504.0/1932.0*anDev*devrAct2)/(1.0-(-1875.0/1932*devSDev + 504.0/1932*anSDev + 504.0/1932*anDev*devSDev));
        double sdevVTes = (-429.75/1932.0 - 1875.0/1932*devVTes + 504.0/1932*anVTes + 504.0/1932*anDev*devVTes)/(1-(-1875.0/1932*devSDev + 504.0/1932*anSDev + 504.0/1932*anDev*devSDev));
        double sdevTest = (-844.25/1932.0 - 1875.0/1932*devTest + 504.0/1932*anTest + 504.0/1932*anDev*devTest)/(1-(-1875.0/1932*devSDev + 504.0/1932*anSDev + 504.0/1932*anDev*devSDev));
        double sdevVDev = (-495.25/1932.0 - 1875.0/1932*devVDev + 504.0/1932*anVDev + 504.0/1932*anDev*devVDev)/(1-(-1875.0/1932*devSDev + 504.0/1932*anSDev + 504.0/1932*anDev*devSDev));


        SDev = sdevrAct3+ sdevVTes*VTes +sdevTest*Test +sdevVDev*VDev;

//        System.out.println(SDev);

        VDev = rAct4/567 - 843.5/567*sdevrAct3 - 717.5*devrAct2/567- 717.5*devSDev*sdevrAct3/567-505*anrAct1/567+505*anSDev*sdevrAct3/567+505*anDev*devrAct2/567+ 505*anDev*devSDev/567*sdevrAct3
                + VTes*(505.*anDev*devSDev/567*sdevVTes - 404./567 - 843.5*sdevVTes/567- 717.5*devVTes/567 - 717.5*devSDev*sdevVTes/567 + 505.*anVTes/567 + 505.*anSDev*sdevVTes/567+505.*anDev* devVTes/567)
                + Test*(505.*anDev*devSDev/567*sdevTest - 884./567 - 843.5*sdevTest/567 - 717.5*devTest/567 - 717.5*devSDev*sdevTest/567 + 505.*anTest/567 + 505.*anSDev*sdevTest/567+505.*anDev* devTest/567)
                + VDev*(505.*anDev*devSDev/567*sdevVDev - 843.5*sdevVDev/567 - 717.5*devVDev/567 - 717.5*devSDev*sdevVDev/567 + 505.*anVDev/567 + 505.*anSDev*sdevVDev/567 + 505*anDev*devVDev/567);


// 827.2248229261568
        System.out.println(VDev);

        VTes = 494.0652;
        Test = 311.1111;

        VDev = (rAct4/567 - 843.5/567*sdevrAct3 - 717.5*devrAct2/567- 717.5*devSDev*sdevrAct3/567-505*anrAct1/567+505*anSDev*sdevrAct3/567+505*anDev*devrAct2/567+ 505*anDev*devSDev/567*sdevrAct3
                + VTes*(505.*anDev*devSDev/567*sdevVTes - 404./567 - 843.5*sdevVTes/567- 717.5*devVTes/567 - 717.5*devSDev*sdevVTes/567 + 505.*anVTes/567 + 505.*anSDev*sdevVTes/567+505.*anDev* devVTes/567)
                + Test*(505.*anDev*devSDev/567*sdevTest - 884./567 - 843.5*sdevTest/567 - 717.5*devTest/567 - 717.5*devSDev*sdevTest/567 + 505.*anTest/567 + 505.*anSDev*sdevTest/567+505.*anDev* devTest/567)
        )/(1-(505.*anDev*devSDev/567*sdevVDev - 843.5*sdevVDev/567 - 717.5*devVDev/567 - 717.5*devSDev*sdevVDev/567 + 505.*anVDev/567 + 505.*anSDev*sdevVDev/567 + 505*anDev*devVDev/567));

        System.out.println(VDev);

        SDev = sdevrAct3+ sdevVTes*VTes +sdevTest*Test +sdevVDev*VDev;
        Dev = devrAct2 + devVTes*VTes + devTest*Test + devVDev*VDev + devSDev*SDev;
        An = anrAct1 - anVTes*VTes-anTest*Test-anVDev*VDev-anSDev*SDev-anDev*Dev;

        System.out.println(VTes);
        System.out.println(Test);
        System.out.println(VDev);
        System.out.println(SDev);
        System.out.println(Dev);
        System.out.println(An);



/*
        System.out.println(act1 + " - " + rAct1 + " = " + (rct1 - rAct1));
        System.out.println(act2 + " - " + rAct2 + " = " + (rct2 - rAct2));
        System.out.println(act3 + " - " + rAct3 + " = " + (rct3 - rAct3));
        System.out.println(act4 + " - " + rAct4 + " = " + (rct4 - rAct4));




*/

    }




    }


