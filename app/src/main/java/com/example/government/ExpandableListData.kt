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
                    "5. Assist with the return of the election materials to the SPO. \n\n")
            myFavTennisPlayers.add("3. PROFESSIONAL ETHICS OF ELECTION OFFICIALS\n" +
                    "The credibility of an election confers legitimacy on the election and acceptability of\n" +
                    "the outcome of the election. The Commission strives to ensure the legitimacy of the\n" +
                    "processes for which it is responsible. To achieve this, Election Officials must\n" +
                    "recognize and understand that the successful administration of the election process is\n" +
                    "founded on the basic fundamental guiding principles of independence, impartiality,\n" +
                    "integrity and transparency. These principles form the ethical basis of election\n" +
                    "administration and are essential to ensure both the appearance and the actual integrity\n" +
                    "of the electoral process. The guiding principles are the ethical framework for election\n" +
                    "officials conducting election If the election must be credible and the outcome\n" +
                    "acceptable, Election Officials, in the discharge of their duties must:\n" +
                    "• Be transparent and neutral\n" +
                    "• Exhibit high level of integrity\n" +
                    "• Be credible, courageous and dedicated\n" +
                    "• Respect the secrecy of the vote\n" +
                    "• Conduct their duties according to the Constitution of the Federal Republic of\n" +
                    "Nigeria, 1999, the Rivers State Independent Electoral Commission (RSIEC) Law\n" +
                    "2018 and RSIEC Guidelines. \n\n" +
                    "4. ACCESS TO POLLING STATIONS AND COLLATION CENTRES\n" +
                    "The following categories of persons shall be allowed full access to the polling\n" +
                    "stations and collation centres:\n" +
                    "• Voters\n" +
                    "• RSIEC officials on Election duty\n" +
                    "• Security Agents\n" +
                    "• Accredited Polling/Agents\n" +
                    "• Accredited Journalists\n" +
                    "• Accredited Domestic and International Observers\n" +
                    "• Accredited Monitors\n" +
                    "The presiding Officers and the Returning Officers, however, have the right to bar\n" +
                    "anyone from entering the Polling Station and the Collation Centre respectively,\n" +
                    "should the individual disturb the peace.\n\n" +
                    "4.1 Right and Responsibilities of Polling Party Agents\n" +
                    "The main responsibility of Polling Agents/Party Agents is to attend at Polling\n" +
                    "Stations and collation centres to watch the proceedings i.e. polling and counting of\n" +
                    "ballots and the collation and announcement of results on behalf of their candidates\n" +
                    "and political parties: and be satisfied that the processes are conducted in\n" +
                    "accordance with the law and the regulations.\n" +
                    "With regard to the Polling Agents, Election Officials shall:\n" +
                    "• Allow each political party to be represented by one accredited Polling l Party\n" +
                    "Agent at a time in the polling stations and collation centres.\n" +
                    "• Accredited Party Agents must have RSIEC issued ID cards displayed at all times.\n" +
                    "• Inspect and ensure that the letters of appointments Accreditation are duly\n" +
                    "endorsed by RSIEC before letting the Polling/Party Agents into the polling\n" +
                    "stations and collation centres.\n" +
                    "• Allow the Polling/Party Agents access to the polling station and collation centres\n" +
                    "to watch the conduct of the polls and the counting and collation of votes and the\n" +
                    "announcement of results.\n" +
                    "• Commence the election processes even if no Polling/Party Agents are present in\n" +
                    "the polling stations or collation centres.\n" +
                    "• Allow Polling/Party Agents to call the attention of the Presiding Officer and\n" +
                    "Collation/Returning Officer to any irregularity.\n" +
                    "• At the Polling Station, allow Polling/Party Agents to inform the Presiding\n" +
                    "Officer if they believe that any voter is under the age of 18 years or has\n" +
                    "committed an offence of impersonation.\n" +
                    "• Mow all Polling/Party Agents to sign the Result Sheets/Forms at the polling\n" +
                    "station and the collation forms at the collation centres.\n" +
                    "• Distribute signed and stamped copies of the Statement of Result of Poll Forms\n" +
                    "and Collation of Result Forms to the Poling/Party Agents.\n" +
                    "Polling/Party Agents are not allowed to interfere in the conduct of the polls and\n" +
                    "the counting of the ballots or the collation and declaration of results.\n" +
                    "Polling/Party Agents shall comply with any lawful directive issued by or under\n" +
                    "the authority of RSIEC including an order to leave the polling station or\n" +
                    "collation centre.\n" +
                    "4.2 Rights and Responsibility of Accredited Observers\n" +
                    "Domestic and International observers have the right to observe the voting\n" +
                    "process, the counting of ballots at the polling stations, the collation and\n" +
                    "announcement of results at the collation centres, and Declaration of Results at\n" +
                    "the Headquarters.\n" +
                    "With regard to Election Observers, Election Officials shall:\n" +
                    "• Be satisfied that the Election Observers are duly accredited.\n" +
                    "• Allow the Observers access to the polling stations and collation centres to\n" +
                    "observe the conduct of the polls, the counting of the votes and the collation of\n" +
                    "Results.\n" +
                    "• Allow observers to call the attention of the Presiding Officer and the Returning\n" +
                    "Officer to any irregularity.\n")
            myFavTennisPlayers.add("Election Observers are not allowed to interfere in the conduct of the poll,\n" +
                    "counting of ballots or the collation, announcement and declaration of result.\n" +
                    "Observers shall comply with any lawful directive issued by or under the\n" +
                    "authority of RSIEC including an order to leave the polling station or the\n" +
                    "collation centre.\n" +
                    "4.3 Responsibility of Security Agents\n" +
                    "It is important that the conduct of the poll and the collation, announcement and\n" +
                    "declaration of results be done without any disturbance or threat to the peace.\n" +
                    "Security Agents shall:\n" +
                    "• Provide security at the p01mg stations and collation centres to ensure that the\n" +
                    "polling, counting of ballots, collation, announcement and declaration of results are\n" +
                    "conducted without any disturbance.\n" +
                    "• Take all necessary measures to prevent violence or any activity that would threaten\n" +
                    "to disrupt the elections.\n" +
                    "• Comply with any lawful directions issued by Election Officials or under the\n" +
                    "authority of RSIEC.\n" +
                    "• Ensure the safety and security of all election materials by escorting and guarding\n" +
                    "the materials, as appropriate.\n" +
                    "• Protect the Election Officials at the polhn9 stations and collation centres.\n" +
                    "• A7est on the instruction of the Presiding Officer or other RSIEC officials any\n" +
                    "person causing any disturbance or preventing the smooth conduct of proceedings\n" +
                    "at the polling stations and collation centres.\n" +
                    "• At the polling station. inform the Presiding Officer if they believe that any voter is\n" +
                    "under age of 18 years or has committed an offence of impersonation.\n" +
                    "• On the instruction of the Presiding Officer, stand at the end of the queue of voters\n" +
                    "at the p01mg station, if any, at the time set for the closing of Polls (3:00 pm)\n" +
                    "prompt, so that any person entering the polling station after this time is not allowed\n" +
                    "to vote.\n" +
                    "• Accompany the Presiding Officer to deliver the election results, ballot boxes and\n" +
                    "other election materials safety to Ward Collation Centre.\n" +
                    "• Security Agents are not allowed to interfere in the conduct of the polls, counting of\n" +
                    "the ballots, the collation, or announcement and declaration of results. ")
            expandableListDetail["CHAPTER 3"] = myFavCricketPlayers
            expandableListDetail["CHAPTER 4"] = chapterFour
            expandableListDetail["CHAPTER 1"] = myFavTennisPlayers
            expandableListDetail["CHAPTER 2"] = myFavFootballPlayers

            return expandableListDetail
        }
}