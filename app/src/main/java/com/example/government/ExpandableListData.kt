package com.example.government

import java.util.*
internal object ExpandableListData {
    val data: HashMap<String, List<String>>
        get() {
            val expandableListDetail =
                HashMap<String, List<String>>()
            val myFavCricketPlayers: MutableList<String> =
                ArrayList()
            myFavCricketPlayers.add("\t\t\tELECTION PERSONNEL\n" +
                    "Every election involves different categories of personnel. These range from Election\n" +
                    "Officials who directly handle the conduct and/or supervision of the elections, to other\n" +
                    "Contestants, Polling or Party agents, the Security Agents, Representatives of the\n" +
                    "Media, Observer Groups and the Voters. ")
            myFavCricketPlayers.add("Sehwag")
            myFavCricketPlayers.add("Shane Watson")
            myFavCricketPlayers.add("Ricky Ponting")
            myFavCricketPlayers.add("Shahid Afridi")

            val myFavFootballPlayers: MutableList<String> = ArrayList()
            myFavFootballPlayers.add("\t\t\tELECTION PERSONNEL\n" +
                    "Every election involves different categories of personnel. These range from Election\n" +
                    "Officials who directly handle the conduct and/or supervision of the elections, to other\n" +
                    "Contestants, Polling or Party agents, the Security Agents, Representatives of the\n" +
                    "Media, Observer Groups and the Voters. ")
            myFavFootballPlayers.add("Lionel Messi")
            myFavFootballPlayers.add("Gareth Bale")
            myFavFootballPlayers.add("Neymar JR")
            myFavFootballPlayers.add("David de Gea")

            val chapterFour: MutableList<String> = ArrayList()
            chapterFour.add("\t\t\tELECTION PERSONNEL\n" +
                    "Every election involves different categories of personnel. These range from Election\n" +
                    "Officials who directly handle the conduct and/or supervision of the elections, to other\n" +
                    "Contestants, Polling or Party agents, the Security Agents, Representatives of the\n" +
                    "Media, Observer Groups and the Voters. ")
            chapterFour.add("Lionel Messi")
            chapterFour.add("Gareth Bale")
            chapterFour.add("Neymar JR")
            chapterFour.add("David de Gea")


            val myFavTennisPlayers: MutableList<String> = ArrayList()
            myFavTennisPlayers.add("\t\t\tELECTION PERSONNEL\n" +
                    "Every election involves different categories of personnel. These range from Election\n" +
                    "Officials who directly handle the conduct and/or supervision of the elections, to other\n" +
                    "Contestants, Polling or Party agents, the Security Agents, Representatives of the\n" +
                    "Media, Observer Groups and the Voters. \n\n" +
                    "1. ELECTION OFFICIALS\n\n" +
                    "These are officers/officials of the Rivers State Independent Electoral Commission who\n" +
                    "directly handle the conduct and/or supervision of the elections. Their engagement may\n" +
                    "be full-time or ad-hoc. The following Election Officials shall administer and manage\n" +
                    "the 2021 elections.\n" +
                    "\t1.1 The Commissioners\n" +
                    "The Commissioners are the officials generally responsible for the conduct and\n" +
                    "supervision of the elections in the State (LGA). Each Commissioner is assigned\n" +
                    "responsibility for designated Local Government Areas.\n" +
                    "\t1.2 Electoral Officer (EO)\n" +
                    "The Electoral Officer (EO) is the officer responsible for the conduct of the elections in\n" +
                    "his/ her designated Local Government Area (LGA). He/She is the Head of the\n" +
                    "Commission’s office in the Local Government Area. He/She is assisted by the\n" +
                    "Assistant Electoral Officer (AEO).\n" +
                    "\t1.3 Returning Officer (RO)\n" +
                    "The Returning Officer, in charge of an election in a particular Ward or LGA,\n" +
                    "tabulates, sums up and announces the results of the election. He/She takes the final\n" +
                    "decision in the field on any matter affecting the conduct of the poll on the Election\n" +
                    "Day.\n" +
                    "\t1.4 Supervisory Presiding Officer (SPO)\n" +
                    "The Supervisory Presiding Officer (SPO) supervises the conduct of the elections in a\n" +
                    "duster of polling stations, usually live; and Liaises between the Commissioner,\n" +
                    "Electoral Officer and about five Presiding Officers and Poll Clerks under his/her\n" +
                    "supervision on all matters affecting the elections especially in the collection and\n" +
                    "distribution of election material.\n" +
                    "The Supervisory Presiding Officer assists the Ward Returning Officer in collating (i.e.\n" +
                    "tabulating and summing up) election results.\n" +
                    "\t1.5 Presiding Officer (PO)\n" +
                    "Presiding Officer (P0) is the p041 official in charge of the conduct of the elections in a\n" +
                    "polling station. He/She is responsible for and takes charge of proceedings of the\n" +
                    "election in the assigned polling station." +
                    "\t1.6 Poll Clerk (PC)\n" +
                    "The Poll Clerk assists the Presiding Officer in the conduct of the elections in a polling\n" +
                    "station; and takes charge of the proceedings of the elections in the polling station in\n" +
                    "the absence of the Presiding Officer.\n" +
                    "\t1.7 Assistant Poll Clerk/Orderly\n" +
                    "The Assistant Poll Clerk also assists the Presiding Officer in the conduct of the\n" +
                    "elections in a polling station.\n" +
                    "\t1.8 Monitor\n" +
                    "The Monitor oversees and ensures compliance with Electoral Laws, Rules &\n" +
                    "Regulations by all electoral personnel. and reports to the Commissioner in charge of\n" +
                    "the Local Government Area. ")

            myFavTennisPlayers.add("\t\t\t2. DUTIES OF ELECTION OFFICIALS\n\n" +
                    "2.1 Duties of the Electoral Commissioner\n" +
                    "The Electoral Commissioner shall:\n" +
                    "\t1. Be responsible to the Commission for the Local Government Council elections\n" +
                    "in his/her assigned Local Government Area.\n" +
                    "\t2. . Take delivery of all sensitive and non-sensitive materials for the elections\n" +
                    "from Rivers State Independent Electoral Commission Headquarters and\n" +
                    "distribute them to the Electoral Officers.\n" +
                    "\t3. Supervise the recruitment and training of all staff including ad-hoc staff for the\n" +
                    "elections\n" +
                    "\t4. Liaise with the political parties and other stakeholders to ensure the successful\n" +
                    "conduct of the elections \n\n" +
                    "2.2 Duties of the Electoral Officer (EO)\n" +
                    "The EO shall:\n" +
                    "1. Receive election materials from the Commissioner and distribute them to and\n" +
                    "receive them from the SPOs.\n" +
                    "2. Conduct training for the SPOs.\n" +
                    "3. Supervise the training of the Presiding Officers, Poll Clerks and Assistant Poll\n" +
                    "Clerks by the SPOs.\n" +
                    "4. Monitor the elections in the Local Government Area to ensure that they are\n" +
                    "property conducted.\n" +
                    "5. Report any Security concern or incident to the Security Agencies.\n" +
                    "6. Keep securely the ballot boxes and other electoral materials returned")
            myFavTennisPlayers.add("2.3 Duties of Collation and Returning Officers\n" +
                    "S/N ELECTION OFFICIAL DUTIES\n" +
                    "The Respective Election Officer shall:\n" +
                    "1. Ward Returning Officer Receive and collate election results from\n" +
                    "the polling stations in the Ward\n" +
                    "2. Announce the results of the\n" +
                    "Councillorship & Chairmanship election\n" +
                    "of the Ward\n" +
                    "3. Local Government Area\n" +
                    "(LGA) Returning Officer\n" +
                    "Receive and collate election results from\n" +
                    "the Ward Returning Officers for the Local\n" +
                    "Government Area.\n" +
                    "Announce the result of the Local\n" +
                    "Government Area Chairmanship election\n\n" +
                    "2.4 Duties of the Supervisory Presiding Officer (SPO)\n" +
                    "The SPO shall:\n" +
                    "1. Supervise the arrangement for the conduct of the poll in a cluster of not more\n" +
                    "than five polling stations.\n" +
                    "2. Assist in the training of the Presiding Officers, Poll Clerks and Assistant Poll\n" +
                    "Clerks under his/her Supervision.\n" +
                    "3. Ensure that all sensitive and non-sensitive election materials are available at the\n" +
                    "assigned polling stations in the right quantities at the right time.\n" +
                    "4. Regularly visit the polling stations under his/her supervision to attend to\n" +
                    "problems during the period of the elections.\n" +
                    "5. Ensure that the forms for the poll for the assigned polling stations have been\n" +
                    "entered on Forms RSIEC. 8A and RSIEC. 8A (I) and submitted to the Ward\n" +
                    "Returning/Collation Officer.\n" +
                    "6. Ensure that all election materials returned by the Presiding Officer are submitted\n" +
                    "to the Electoral Officer immediately after the elections.\n" +
                    "7. Liaise with the Security Agents to ensure that law and order are maintained\n" +
                    "within the polling stations under his/her supervision.\n" +
                    "8. Be accountable to the Electoral officer in the discharge of his/her duties\n\n")
            myFavTennisPlayers.add("2.5 Duties of the Presiding Officer\n" +
                    "The Presiding Officer shall:\n" +
                    "1. Be in charge of all proceedings at the polling station on the Election Day\n" +
                    "including the voting and counting of the votes.\n" +
                    "2. Take delivery of all materials for the elections from the SPO and keep them\n" +
                    "secure, especially the sensitive materials, such as the Ballot papers and Result\n" +
                    "Sheets/forms.\n" +
                    "3. Be at the polling station early (at least one hour before the official opening of the\n" +
                    "poll) to set up the polling station before the commencement of the poll.\n" +
                    "4. Supervise the Poll Clerk and Poll Assistant assigned to the polling station.\n" +
                    "5. Submit the result of the poll to the Ward Returning Officer.\n" +
                    "6. Return all election materials to the SPO at the Ward Collation Centre for delivery\n" +
                    "to the Electoral Officer after the elections.\n" +
                    "7. Report any security incident to the Security Agents at the polling station, and\n" +
                    "where necessary, invite the Police or Security Agents to maintain order, keep the\n" +
                    "peace or arrest any person committing an offence\n\n" +
                    "2.6 Duties of the Poll Clerk\n" +
                    "The Poll Clerk shall:\n" +
                    "1. Work under the supervision of the Presiding Office\n" +
                    "2. Assist with the collection of materials from the SPO.\n" +
                    "3. Check the voters’ cards and the register of voters to ascertain The eligibility of\n" +
                    "voters.\n" +
                    "4. Assist with the sorting and counting of the votes.\n" +
                    "5. Take charge of the polling station as directed by the Presiding Officer if the PO\n" +
                    "is indisposed while on duty.\n" +
                    "6. Assist with the return of the election materials to the SPO.\n" +
                    "7. Report any security concern or incident to the Security Agencies.\n" +
                    "8. Keep securely the election results, ballot boxes and other election materials\n" +
                    "returned.\n\n" +
                    "2.7 Duties of the Assistant Poll Clerk\n" +
                    "The Poll Clerk shall:\n" +
                    "1. Work under the supervision of the Presiding Officer.\n" +
                    "2. Apply indelible ink on the appropriate finger of the eligible voter.\n" +
                    "3. Stand behind the last person in the queue at the close of voting (3.00 pm) to\n" +
                    "ensure that anyone arriving after that time will not vote.\n" +
                    "4. Assist in the sorting and counting of votes.\n" +
                    "5. Assist with the return of the election materials to the SPO. ")
            myFavTennisPlayers.add("")
            expandableListDetail["CHAPTER 3"] = myFavCricketPlayers
            expandableListDetail["CHAPTER 4"] = chapterFour
            expandableListDetail["CHAPTER 1"] = myFavTennisPlayers
            expandableListDetail["CHAPTER 2"] = myFavFootballPlayers

            return expandableListDetail
        }
}