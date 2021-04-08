package com.example.government

import java.util.*
internal object ExpandableListData {
    val data: HashMap<String, List<String>>
        get() {
            val expandableListDetail =
                HashMap<String, List<String>>()
            val myFavCricketPlayers: MutableList<String> =
                ArrayList()
            myFavCricketPlayers.add("\t\t\tVOTING PROCEDURE\n\n" +
                    "3.1 CHECKING THE REGISTER FOR THE VOTER’S NAME\n" +
                    "Step1: A prospective voter shall present him/herself with his/her (temporary or\n" +
                    "permanent) Voter’s card or affidavit of loss together with any of the following: I)\n" +
                    "National identity Card. ii) Driver’s License, iii) International Passport which must be\n" +
                    "presented to the Poll Clerk at the polling station.\n" +
                    "Step 2: On presentation of the voter’s card to the Poll Cleric the Poll Clerk shall look\n" +
                    "closely at the face of the person and examine the voters card to ascertain that the photo\n" +
                    "on the d is that of the person\n" +
                    "If the photo on the voter’s card does not agree with the face of the person, the Pol1\n" +
                    "Clerk shall prevent the person from voting.\n" +
                    "If the photo on the voter’s card or other document ii support of the affidavit agrees\n" +
                    "with the face of the person, the Poll Clerk shall inspect the cuticle of the person’s left\n" +
                    "thumb indelible ink stain.\n" +
                    "If the person has inde4ible ink on the cuticle of his/her left thump, the person shall be\n" +
                    "prevented from voting. The Presiding Officer shall instruct the Security Agent to\n" +
                    "detain the person for further investigation.\n" +
                    "If there is no ink stain on the person’s left thumb\n" +
                    "Step 3: The Poll Clerk shall check the register of voters to confirm that the person’s\n" +
                    "name and number as contained on the voter’s card are in the register.\n" +
                    "If the voter’s name is not in the register, the person shall be prevented from voting.\n" +
                    "If the voter’s name on the register has already been ticked for the election, the\n" +
                    "tendered ballot process explained later in this chapter shall be followed.\n" +
                    "Step 4: If the voter’s name is in the Register of Voters, the Poll Clerk shall tick the\n" +
                    "voter’s name in the register to indicate that he/she wit? be vo5ng in the election as\n" +
                    "shown below.\n" +
                    "Step 5: The Poll Clerk shall then mark the back of the voter’s card. with a large X if\n" +
                    "the card is not laminated. If the voter’s card is laminated, the Poll Clerk shall punch a\n" +
                    "hole on the card. \n" +
                    "TICKING THE REGISTER\n" +
                    "To indicate that a voter has been accredited and will be voting in the election, the Poll\n" +
                    "Clerk shall ck the register as follows:\n" +
                    "Type of Election\n" +
                    "Councillorship Elections\n" +
                    "Chairmanship Elections\n" +
                    "Tick Register\n" +
                    "In blue, or black ink\n" +
                    "In red ink \n" +
                    "Step 6: The Poll Clerk shall then pass the voter’s card to the Poll Assistant.\n" +
                    "The Poll Assistant on receiving the voter’s card shall:\n" +
                    "Step 7: Apply indelible ink to the cuticle of the voter’s thumb nail, for Councillorship\n" +
                    "and Chairmanship Elections.\n" +
                    "Before applying the ink, the Poll Assistant shall ensure that there is no greasy\n" +
                    "substance on the voter’s thumb or finger. if there is, the voter shall be instructed to\n" +
                    "clean it before the indelible ink is applied.\n" +
                    "APPLYING INDELIBLE INK\n" +
                    "1. For voters who are missing the Right/Left hand thumb, the Poll Assistant shall\n" +
                    "apply the indelible ink to the next finger of the respective hand.\n" +
                    "2. If the voter has no Right/Left hand, the Poll Assistant shall apply the indelible\n" +
                    "ink to the corresponding toes of the voter’s Right/Left foot.\n" +
                    "Step8: The Poll Assistant shall return the voter and direct the voter to the presiding\n" +
                    "officer to receive the ballot papers.\n" +
                    "HOW TO APPLY THE INDELIBLE INK\n" +
                    "The indelible in must be applied on the cuticle of the appropriate thumb/finger of the\n" +
                    "voter’s hand according to the type of election.\n" +
                    "3.2 ISSUING BALLOT PAPERS AND VOTING\n" +
                    "Voting shall be by Open/Secret Ballot. The voter shall present him/herself to the\n" +
                    "Presiding Officer as directed by the Polling Assistant.\n" +
                    "The Presiding Officer Shall:\n" +
                    "Step1: On seeing\n" +
                    "Step 3: Issue the endorsed ballot paper(s) to the voter.\n" +
                    "NOTE: The ballot papers for the Councillorship and Chairmanship Election bear the\n" +
                    "Party Name and Logo of Political Parties, and Space for the voters mark as\n" +
                    "illustrated\n" +
                    "The ballot papers for both Councillorship and the Chairmanship Election do not\n" +
                    "bear the photograph of the contestants.\n" +
                    "Step 4: Direct the voter to move to the polling booth/secret voting corner to\n" +
                    "thumbprint the ballot paper(s) in the space provided beside the name and\n" +
                    "logo of the political party of the candidate of the voter’s choice; fold the\n" +
                    "ballot paper(s) and thereafter deposit the marked ballot paper(s) in the ballot\n" +
                    "box.\n" +
                    "NOTE: The marking or thumb printing of the ballot paper s) by the voter must be\n" +
                    "done in secret and the casting of the ballot(s) in the ballot box done in open\n" +
                    "view of all person present.\n" +
                    "Only one voter at a time will be allowed in the polling booth/secret voting\n" +
                    "corner for marking ballot paper(s).\n" +
                    "A voter who is blind or is otherwise unable to distinguish symbols or who\n" +
                    "suffers any other physical disability is allowed to be accompanied into the\n" +
                    "polling station and assisted to vote by a person chosen by him/her\n\n"
                    )
            myFavCricketPlayers.add("SPOILED BALLOT PAPERS\n" +
                    "If a ballot paper is badly torn by the Presiding Officer when detaching it from the\n" +
                    "ballot paper booklet or the ballot paper is by accident dealt with by a voter in such a\n" +
                    "manner that the ballot paper cannot be used for voting, the Presiding Officer shall\n" +
                    "write the word Spoiled’ on the front of the ballot paper and place it in the envelope\n" +
                    "provided. The Presiding Officer shall then issue a fresh ballot paper to the voter.\n" +
                    "TENDERED BALLOT VOTING PROCESS\n" +
                    "if a person claiming to be entitled to vote applies for a ballot paper after another\n" +
                    "person has voted in the name given by the claimant, he or she shall, upon satisfactory\n" +
                    "answers given to any questions put to him/her by the Poll Clerk be entitled to receive\n" +
                    "a ballot paper in the same manner as any other voter; but the ballot paper shall be\n" +
                    "tendered ballot paper.\n" +
                    "If a person has a voter’s card but his/her name in the voters register has already been\n" +
                    "ticked for the election, the Poll Assistant shall:\n" +
                    "Step1: Apply indelible ink to the cuticle of the finger or thumb nail of the voter’s left\n" +
                    "Hand.\n" +
                    "Step 2: Return the voters card to the voter and direct the voter to the Presiding Officer.\n" +
                    "The Presiding Officer shall:\n" +
                    "Step 3: Write the name of the voter and the voter’s number as contained in the voters\n" +
                    "Register on the Tendered Voters List Form RSIEC. 18.\n" +
                    "Step 4: Write the name of the voter and the voter’s number as contained in the\n" +
                    "Register of\n" +
                    "Voters on the back(s) of the tendered ballot paper(s).\n" +
                    "Step 5: Stamp and si9n the back(s) of the ballot paper(s).\n" +
                    "Step 6: Issue the tendered ballot paper(s) to the voter.\n" +
                    "Step 7: Instruct the voter to vote by thumb printing the tendered ballot paper(s) and\n" +
                    "deliver them to the Presiding Officer instead of allowing them to be put inside\n" +
                    "the ballot box.\n" +
                    "Step 8: Put the tendered ballot paper(s), in view of all present, in a packet intended for\n" +
                    "Tendered Ballot Paper(s).\n" +
                    "NOTE: The tendered ballot papers shall later be counted by the Returning Officer. \n" +
                    "CLOSING THE POLL\n" +
                    "The Presiding Officer shall:\n" +
                    "Step 1: At the time appointed for closing the poll, officially announce the close of poll\n" +
                    "but persons already waiting in the queue to vote shall be allowed to vote if\n" +
                    "eligible.\n" +
                    "Step 2: Direct the Poll Assistant or the Security Agent to stand behind the last person\n" +
                    "on the queue to prevent anyone joining in.\n" +
                    "NOTE: Any person who comes into the polling station after the closing time shall be\n" +
                    "prevented from joining the queue. \n\n")


            val myFavFootballPlayers: MutableList<String> = ArrayList()
            myFavFootballPlayers.add("\t\t\tPREPARATIONS FOR ELECTIONS\n" +
                    "2.1 RECEIVING ELECTION MATERIALS ON THE EVE OF ELECTION\n" +
                    "DAY\n" +
                    "The following procedures shall be followed on the day before Election Day.\n" +
                    "The Presiding Officer shall:\n" +
                    "Step1: Receive the non-sensitive hems from the SPO for use at the polling station.\n" +
                    "Step2: Upon receiving the non-sensitive items, verify and record all items on Form\n" +
                    "RSIEC. 16 in duplicate and then sign the form as a receipt for the items and\n" +
                    "submit one copy of the Form RSIEC. 16 to the SPO.\n" +
                    "Step 3: Visit the location of his! her polling station to:\n" +
                    "(I) Identify the most suitable layout of the polling station, and\n" +
                    "(II) Make arrangements for tables and chairs to be used at the polling station on\n" +
                    "Election Day.\n" +
                    "See table below for the checklist of non-sensitive items that the Presiding Officer will\n" +
                    "receive on me eve of Election Day for the:\n" +
                    "Councillorship Elections; and\n" +
                    "Chairmanship Elections.\n" +
                    "Where there is a run-off election for Councilor or Chairman, the requisite materials\n" +
                    "shall be supplied. \n\n" +
                    "\t\t\tCHECKLIST\n" +
                    "\t\t\tNON-SENSITIVE ITEMS\n" +
                    "COUNCILLORSHIP AND CHAIRMANSHIP ELECTIONS\n" +
                    "ITEMS QTY\n" +
                    "LIST:\n" +
                    "Register of Voters\n" +
                    "1\n" +
                    "FORMS AND POSTERS:\n" +
                    "1. Form RSIEC 15 (Affirmation)\n" +
                    "2. Form RSIEC 16 (Electoral Materials Receipt)\n" +
                    "3. Form RSIEC 11 (Ballot Paper Account and Verification Statement)\n" +
                    "4. Form RSIEC 12 (Statement of Spoiled Ballot Papers and Rejected Ballots)\n" +
                    "5. Form RSIEC 17 (Tendered Ballot Statement) I\n" +
                    "6. Form RSIEC 18 (Tendered Voters List)\n" +
                    "7. Polling Zone Poster\n" +
                    "8. Voting Process Poster\n" +
                    "2\n" +
                    "2\n" +
                    "2\n" +
                    "1\n" +
                    "1\n" +
                    "1\n" +
                    "1\n" +
                    "1\n" +
                    "2.2 RECEMNG ELECTION MATERIALS ON ELECTION DAY\n" +
                    "The Presiding Officer shall:\n" +
                    "Step1: Arrive at the Polling Station/Distribution centre not later than 6:00am on the\n" +
                    "Election Day.\n" +
                    "Step2:Receive the sensitive items for use at the polling stations from the SPO.\n" +
                    "Step3: Record on Form RSIEC.11 the serial numbers of the ballot papers and total\n" +
                    "quantity of ballot papers for each type of election received from the SPO. \n" +
                    "The following are the checklists of sensitive items that the presiding Officer will\n" +
                    "receive on the Election Day for the:\n" +
                    "1. Councillorship Elections; and\n" +
                    "2. Chairmanship Elections.\n" +
                    "Where there is a bye-election for the Councilor or Chairman, the necessary materials\n" +
                    "shall be provided for.\n" +
                    "Sensitive Materials:\n" +
                    "1. Ballot Papers\n" +
                    "2. Result Sheets \n" +
                    "2.3 SETTLING UP AND OPENING THE POWNG STATION\n" +
                    "To setup and open the Polling Station on Election Day, the Presiding Officer\n" +
                    "shall:\n" +
                    "Step 1: Remove all campaign materials, any, from the Polling Station.\n" +
                    "Step2: Arrange the tables and chairs to facilitate easy access for the voters.\n" +
                    "Step 3: Set up the polling booth/secret voting corner in such a way that the voter\n" +
                    "can mark his! her ballot paper(s) without any person seeing the way he/she\n" +
                    "voted.\n" +
                    "Step 4: Put one stamp pad in the polling booth/secret voting corner for use by the\n" +
                    "voter to\n" +
                    "thumb print the ballot paper(s).\n" +
                    "Step5: Hang up posters for Poling Zone, Polling Station and Voting Process.\n" +
                    "Step 6: Place the Register of Voters, RSIEC stamp, endorsing ink, indelible ink and\n" +
                    "biro\n" +
                    "on Table 1 for the use of the Poll Cleric and the Poll Assistant\n" +
                    "Step 7: Place the ballot papers, tendered ballot papers, tendered voters list, RSIEC\n" +
                    "stamp,\n" +
                    "stamp pad, endorsing ink and biro on Table 2 b use by the Presiding Officer.\n" +
                    "Step 8: Allow the edited Party Agents, Observers and Journalists to enter the Polling\n" +
                    "Station.\n" +
                    "Step9: Allow voters into the polling station in an orderly queue.\n" +
                    "NOTE: If there are no Party Agents or Observers present the Presiding Officer shall\n" +
                    "go ahead with the stated procedure\n" +
                    "2.4 OPENING OF THE POLL\n" +
                    "The Presiding Officer Shall:\n" +
                    "Step1: At 10:00am, declare the poll open and according.\n" +
                    "Step2: Open the ballot box and display it to persons present at the polling station b\n" +
                    "show\n" +
                    "that the ballot box m empty.\n" +
                    "Step 3: Lock the ballot box with the seal or padlock provided and place the ballot box\n" +
                    "in\n" +
                    "the open and most suitable position within the polling station.\n" +
                    "Step4: Explain the voting procedure to all present."
                    )


            val chapterFour: MutableList<String> = ArrayList()
            chapterFour.add("\t\t\tSORTING & COUNTING OF BALLOTS\n" +
                    "After the Close of Poll, the Presiding Officer shall arrange the polling station for the\n" +
                    "sorting and counting of ballots in the presence of candidates or their Party Agents,\n" +
                    "Poll Clerks, Poll Orderly and Accredited Observers.\n" +
                    "4.1 SORTING THE BALLOTS\n" +
                    "Before opening the Ballot Box, the Presiding Officer shall count and record the\n" +
                    "number of:\n" +
                    "1. Unused ballot papers\n" +
                    "2. Counterfoils of used ballot papers: and\n" +
                    "3. Spoiled ballot papers\n" +
                    "The Presiding Officer shall:\n" +
                    "Step 1: Count the unused ballot papers and record the quantity and serial numbers of\n" +
                    "the unused ballot papers on RSIEC. 11.\n" +
                    "Step 2: Put the unused ballot papers in the envelope provided.\n" +
                    "Step 3: Count the counterfoils of the used ballot papers and record the quantity of used\n" +
                    "ballot papers on RSIEC. 11.\n" +
                    "Step 4: Put the counterfoils of the used ballot papers in the envelope(s) provided.\n" +
                    "Step 5: Count any spoiled ballot papers. Record the quantity of spoiled ballot papers\n" +
                    "and their serial numbers on RSIEC. 12.\n" +
                    "Step 6: Put the spoiled ballot papers in the envelope(s) provided.\n" +
                    "Step 7: Cut the seals/unlock the padlock on the ballot box and empty the ballot box in\n" +
                    "the full view of the poll clerk, poll orderly, candidate or their agents.\n" +
                    "Step 8: Sort the ballot papers separating the Councillorship election ballot papers from\n" +
                    "the chairmanship election ballot papers putting the ballot papers face\n" +
                    "upwards.\n" +
                    "Step 9: Starting with the chairmanship Election ballot papers, sort out the ballots\n" +
                    "according to parties following the steps below; complete the vote count, the\n" +
                    "recording of the votes, the announcement and transmission of results, then\n" +
                    "proceed to sort the Councillorship Election ballots in the same manner.\n" +
                    "Step 10: Sort out the rejected ballots for the chairmanship election.\n" +
                    "Step 11: Write ‘REJECTED’ on the front of every rejected ballot. \n" +
                    "4.2 COUNTING THE VOTES\n" +
                    "On completion of the Sorting procedure for Chairmanship and Councillorship\n" +
                    "Elections ballot papers, the Presiding Officer shall:\n" +
                    "Step 1: Loudly count the votes scored by each party in each election; beginning with\n" +
                    "the chairmanship election and then the councillorship election.\n" +
                    "Step 2: Write on a sheet of paper the valid votes scored by each party in each election\n" +
                    "to allow for cross checking before writing the same on FORM RSIEC. 8A\n" +
                    "(Election to the Office of Chairman) & FORM RSIEC. 8A (1) (Election to the\n" +
                    "Office of Councilor).\n" +
                    "Step 3: Verify the results of the poll by adding the following, to get the number of\n" +
                    "used ballot papers:\n" +
                    "(a) The number of spoiled ballot papers\n" +
                    "(b) The number of rejected ballot papers: and\n" +
                    "(C) The number of valid votes scored by political parties.\n" +
                    "The number of used ballot papers (a) + (b) + (C) should equal the number of ballot\n" +
                    "papers issued to the polling station, less the number of unused ballot papers. \n" +
                    "Step 4: Where the sum of the total number of spoiled ballot papers plus rejected ballot\n" +
                    "papers plus valid votes does not equal the total number of used ballot papers, CARRY\n" +
                    "OUT A THOROUGH CHECK AND RECOUNT.\n" +
                    "Step 5: Where an anomaly exists, the Presiding Officers shall inform those present of\n" +
                    "the problem and then enter the votes scored by each of the parties and the other\n" +
                    "information required on FORM RSIEC. 8AIRSIEC. 8A (1) and write the words\n" +
                    "‘ANOMALY EXISTS’ across the Form.\n" +
                    "Presiding Officer is to submit a report along with the ballot papers and the\n" +
                    "Form RSIEC. BA and Form RSIEC. 8A (1).\n" +
                    "Step 6: Where me total votes cast at a polling station exceeds the number of registered\n" +
                    "voters, in the polling station, the result of the poll shall be rendered null and\n" +
                    "void.\n" +
                    "Where the result of the poll is rendered null and void, the Presiding Officer\n" +
                    "shall write the words ‘NULL and VOID’ across the form RSIEC. 8A IRSIEC.\n" +
                    "8A (1).\n" +
                    "Where an anomaly exists or the result of poll is rendered null and void, the\n" +
                    "Presiding Officer shall state the nature of the problem and ensure that this is\n" +
                    "transmitted. The figures of the result of the poll SHALL NOT be transmitted in\n" +
                    "either case.\n" +
                    "Please Note:\n" +
                    "1. A polling agent /candidate may request a recount. However, such a recount may\n" +
                    "be done only once.\n" +
                    "2. A Presiding Officer shall use Form RSIEC. 8A for Chairmanship Election and\n" +
                    "RSIEC. 8A (1) for Councillorship Election.\n" +
                    "4.3 FILLINGIRECORDING OF VOTES ON FORM RSIEC. 8A & FORM RSIEC.\n" +
                    "8A The Presiding Officer shall:\n" +
                    "Step 1: Fill the Names and Codes of the polling stations, Ward, Local Government\n" +
                    "Area and State (if not printed on the Form)\n" +
                    "Step 2: Record the number of registered voters as contained in the Register of Voters.\n" +
                    "Step 3: Refer to Form RSIEC. 11 to record the total number of spoiled ballot papers\n" +
                    "and the number of rejected ballots.\n" +
                    "Step 4: Refer to RSIEC. 12 to record the number of spoiled ballot papers and the\n" +
                    "number of rejected ballot papers.\n" +
                    "Step 5: Record the valid votes scored by each political party in figures and in words in\n" +
                    "the space provided.\n" +
                    "Step 6: Add up and record the total valid votes scored by all the parties at the bottom\n" +
                    "of the Form as well as in the box for Item 6 at the top of the Form.\n" +
                    "Step 7: Add up the number of spoiled ballot papers plus the number of rejected ballot\n" +
                    "papers plus the total of valid votes to get the number of used ballot papers and\n" +
                    "record same in the box provided. \n" +
                    "Step 8: Write his/her name on the Form, stamp and date and sign the FORM and\n" +
                    "request the Party agents present to sign the Form.\n" +
                    "Note: Refusal by Party agent to sign FORM RSIEC. 8A1 RSIEC. 8A (1) does not\n" +
                    "invalidate the result of the poll.\n" +
                    "Step 9: Loudly announce the result of the poll at the polling station for the information\n" +
                    "of those present.\n" +
                    "Please Note: The figures as entered in FORM 8AIFORM 8A (1) shall be\n" +
                    "transmitted either physically or electronically (or on using both media) to the\n" +
                    "Ward Collation Centre, other Collation Centres and RSIEC Head Office.\n" +
                    "Where an anomaly exists and the words “ANOMALY EXISTS” are written on\n" +
                    "the FORM 8A & FORM 8A (1), the figures shall not be transmitted. The\n" +
                    "Presiding Officer shall state the nature of the anomaly that exists, and this shall\n" +
                    "be transmitted.\n" +
                    "Where the result of the poll is rendered null and void, and the words “NULL &\n" +
                    "VOID” are written on the result forms, the figures of the result of the poll shall\n" +
                    "not be transmitted. The Presiding Officer shall transmit the fact that the poll has\n" +
                    "been rendered null and void and the reason for this is what shall be transmitted.\n" +
                    "Step 10: The Presiding Officer shall give a copy of the completed FORM RSIEC. 8A;\n" +
                    "RSIEC. 8A to each of the Party Agents, State Security Service and the Police\n" +
                    "present at the Polling Station.\n"
                    )
            chapterFour.add("4.4 PACKING UP\n" +
                    "Following the completion of the counting and recording of the votes on FORM\n" +
                    "RSIEC.\n" +
                    "8A (1) The Presiding Officer shall:\n" +
                    "Step 1: Put the following items in the respective envelopes provided:\n" +
                    "1. Register of Voters and Tendered Voters’ list.\n" +
                    "2. Used ballot papers\n" +
                    "3. RSIEC. 11 (Ballot Paper Account & Verification Statement)\n" +
                    "4. Form RSIEC. 8A (Statement of Result of Poll from Polling Stations) for\n" +
                    "Chairmanship Elections.\n" +
                    "5. FORM RSIEC. 8A (1) (Statement of Result of Poll from Polling Stations) for\n" +
                    "Councillorship Elections.\n" +
                    "Step 2: Gather the other envelopes containing items which were dealt with during the\n" +
                    "sorting process.\n" +
                    "1. Unused ballot papers\n" +
                    "2. Counterfoils of used ballot papers\n" +
                    "3. Tendered baflot papers and RSIEC. 17 (Tendered Ballot Statement). \n" +
                    "4. Spoiled and rejected ballot papers and RSIEC. I 2(Statement of Spoiled Ballot\n" +
                    "Papers and Rejected Ballot Papers).\n" +
                    "Step 3: Put the following envelopes in the ballot box:\n" +
                    "1. Envelope(s) containing the counter toils of the used ballot papers.\n" +
                    "2. Envelope(s) containing the used ballot papers.\n" +
                    "Step 4: Seal/Lock the ballot box with the seals/padlock provided.\n" +
                    "Step 5: Put all the remaining envelope(s) in the bag:\n" +
                    "1. Envelope containing the register of voters and the tendered Votes List.\n" +
                    "2. Envelope containing RSIEC. 11.\n" +
                    "3. Envelope(s) containing unused ballot papers.\n" +
                    "4. Envelope(s) containing tendered ballot papers\n" +
                    "5. Envelope(s) containing spoiled and rejected ballot papers.\n" +
                    "6. Envelope(S) containing FORM RSIEC. BA\n" +
                    "7. Envelope(s) containing FORM RSIEC. 8A (1) as well as all the miscellaneous\n" +
                    "materials such as the RSIEC stamps, indelible and endorsing ink, stamp pads.\n" +
                    "biros, etc.\n" +
                    "Step 6: Proceed immediately to the Ward Collation Centre accompanied by the Poll\n" +
                    "Clerk, Poll Assistant, Party Agent (if available) and Security Agents with the:\n" +
                    "• Completed FORMS RSIEC. 8A I RSIEC. 8A (I)\n" +
                    "• Bag\n" +
                    "• Ballot box\n" +
                    "• Polling booth/screen, if provided\n" +
                    "Step 7: Submit the completed FORM RSIEC. BA I RSIEC. BA (1) to the Ward\n" +
                    "Returning Officer and all other materials to the SPO at the Ward Collation Centre.\n" +
                    "NOTE:\n" +
                    "Where the polling processes are concluded before the official time for the close of\n" +
                    "poll, the Presiding Officer with his team shall not leave the polling station but must\n" +
                    "remain until after the official hour for the close of poll.\n" +
                    "At the end of proceedings in the polling station, the presiding officers with his team\n" +
                    "of poll officials must proceed with the result of the poll and other election materials\n" +
                    "to the Ward Collation Centre and nowhere else. \n\n")


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
            val chapterFive: MutableList<String> = ArrayList()
            chapterFive.add("\t\t\tCOLLATION, ANNOUNCEMENT AND DECLARATION OF RESULTS\n\n" +
                    "The collation and announcement of election results shall be done at any of the\n" +
                    "following levels, depending on the type of election:\n" +
                    "1. Ward\n" +
                    "2. Local Government Area (LGA)\n" +
                    "The collation of results at the Ward level shall be done by the Ward Returning Officer\n" +
                    "at the Ward Collation Centre using Form RSIEC. 8B (Chairman) and RSIEC. 8B (1)\n" +
                    "(Councilor).\n" +
                    "The Ward Collation/Returning Officer shall:\n" +
                    "Step 1: Receive Forms RSIEC. 8A and RSIEC. 8A (1) and any report of Anomalies\n" +
                    "from the Presiding Officer from all the polling stations within the Ward.\n" +
                    "Step 2: Record using Form RSIEC. 8B (Chairman) and RSIEC. 8B(1) (Councilor), the\n" +
                    "following information contained in Forms RSIEC. 8A and Form RSIEC. 8A\n" +
                    "(1) from all polling station within the ward:\n" +
                    "For Each Polling Station:\n" +
                    "▪ Valid votes scored by each Party/Candidate\n" +
                    "▪ Rejected votes\n" +
                    "▪ Votes cast (rejected and valid)\n" +
                    "Step 3: Add up the polling results above to get, for the Ward:\n" +
                    "▪ Total votes scored by each of the Party/Candidate\n" +
                    "▪ Total rejected votes\n" +
                    "▪ Total votes cast for all the parties together plus total rejected votes.\n" +
                    "Step 4: Announce the total scored by each Party/Candidate in the ward, the total\n" +
                    "rejected; and the total votes cast for all the parties plus total rejected votes.\n" +
                    "Step 5: Stamp and sign completed Forms RSIEC. 8B and RSIEC. 8B (1) and invite\n" +
                    "party Agent present to sign the Forms.\n" +
                    "Step 6: Distribute copies of Forms RSIEC. 8B and RSIEC. 8B (1), completed and\n" +
                    "endorsed, to each Party Agent present, the State Security Service and Police. \n" +
                    "Announcement of Councillorship Election Results\n" +
                    "The Ward Collation/Returning Officer shall:\n" +
                    "Step 7: Formally announce the result of the election.\n" +
                    "Step 8: Distribute copies of FORM RSIEC. 88 (1) duly completed and signed to the\n" +
                    "party Agents, the State Security Service and Police.\n" +
                    "Step 9: Deliver the original of FORM RSIEC. 8B (1) as well as originals of Forms\n" +
                    "RSIEC. 8B and RSIEC. 8B (1) and all the Forms RSIEC. 8A and RSIEC. 8A (1)\n" +
                    "collected from the Presiding Officers to the LGA Collation/Returning Officer\n" +
                    "(Electoral Officer).\n" +
                    "Collation of Result at LGA Level\n" +
                    "The collation of result at the LGA Level shall be done by the LGA Returning Officer\n" +
                    "(who shall be the Electoral Officer) at the LGA Collation Centre using Form EC. 8C\n" +
                    "(Chairman).\n" +
                    "The LGA Returning Officer shall:\n" +
                    "Step1: Receive Forms RSIEC. 88 and RSIEC. 8B (1) and any reports from all Wards,\n" +
                    "Collation Officers from the Wards Returning Officer.\n" +
                    "Step 2: Record using Form RSIEC. 8C (Chairmanship Election) and RSIEC. 8C (1)\n" +
                    "(Councillorship Election) the following information contained in Forms\n" +
                    "RSIEC. 8B and RSIEC. 8B (1) from all Wards within the LGA:\n" +
                    "For each Ward:\n" +
                    "▪ Valid votes scored by each Party/Candidate\n" +
                    "▪ Rejected votes\n" +
                    "▪ Votes cast (rejected and valid)\n" +
                    "Step 3: Add up the Ward result to get, for the LGA:\n" +
                    "• Total votes scored by each party/Candidate\n" +
                    "• Total rejected votes\n" +
                    "• Total votes for all the parties together plus the rejected Votes\n" +
                    "Step 4: Announce the total votes scored by each Party/Candidate in the LGA, the total\n" +
                    "rejected votes and the total votes cast.\n" +
                    "Step 5: Stamp and sign the completed Form RSIEC. 8C, RSIEC. 8C (1) and invite\n" +
                    "Party Agents present to sign the Form.\n" +
                    "Step 6: Distribute copies of Form RSIEC. 8C, RSIEC. BC (1) completed and\n" +
                    "endorsed, to Party Agents, the State Security Service and Police. \n" +
                    "Announcement of Result of Chairmanship Election\n" +
                    "The LGA Returning Officer shall:\n" +
                    "Step 7: Formally announce the result and return the winner of the election.\n" +
                    "Step 8: Distribute copies of Form RSIEC. 8C, RSIEC. 8C (1) duly completed and\n" +
                    "signed to the Party Agent, the State Security Service and Police.\n" +
                    "NOTE: The Electoral Officer shall retain the original copy of each of Forms RSIEC.\n" +
                    "8A, RSIEC. 8A (1), RSIEC. 8B, RSIEC. 88 (1), RSIEC. 8C and RSIEC. SC (1)\n" +
                    "in the Commission. ")

            val chapterSix: MutableList<String> = ArrayList()
            chapterSix.add("\tCONFLICT PREVENTION AT THE POLLING STATION\n" +
                    "Election conflict can manifest itself in a number of ways and often occurs during the\n" +
                    "candidate selection process, during the election campaign, on the election day itself at\n" +
                    "the polling station and when results are announced. In this chapter we shall\n" +
                    "concentrate on conflicts at the polling station.\n\n" +
                    "The following table indicates the type of conflict that might arise at the polling station.\n" +
                    "The table is intended to assist the Presiding Officer and other election officials to be\n" +
                    "apprehensive and election officials should anticipate and identify other areas of\n" +
                    "potential conflict themselves.\n\n" +
                    "The best method of preventing conflict at the polling station is for election officials to\n" +
                    "thoroughly understand the election procedure and follow the procedures, as contained\n" +
                    "in this manual. Most of the conflict that will arise at the polling station will result from\n" +
                    "party agents and/or voters’ lack of understanding of the election process. The election\n" +
                    "officials should ensure that the Party agents and voters understand the election\n" +
                    "procedure. The Official shall explain the procedure to the polling agent and voters\n" +
                    "present before opening the polling station. Election officials should ensure that the\n" +
                    "environment at the polling station remains calm and that the election process proceeds\n" +
                    "in an orderly manner.\n\n" +
                    "Attempts should be made to prevent conflict turning into violence and election\n" +
                    "workers may need to be courageous in performing their duties in difficult\n" +
                    "circumstances. The security agents should be used when necessary and poll workers\n" +
                    "should avoid putting themselves in danger on Election Day. \n\n")

            val chapterSeven: MutableList<String> = ArrayList()
            chapterSeven.add("ELECTORAL OFFENCES AND PENALTIES\n" +
                    "UNDER THE RIVERS STATE INDEPENDENT ELECTORAL COMMISSION\n" +
                    "LAW NO.2 OF 2018\n" +
                    "Breaches of Official duty\n" +
                    "(1) Where a person:\n" +
                    "(a) To whom this section applies; or\n" +
                    "(b) Who is under a duty to discharge any of the functions of that without\n" +
                    "reasonable cause, Commits an act or omission in breach of his official duty, he\n" +
                    "commits an offence and is liable on conviction to imprisonment for a term of 1\n" +
                    "year or a Fine of N50,000 or both.\n" +
                    "(2) The persons to whom this second applies are:\n" +
                    "(a) An Electoral Officer and an Assistant Electoral Officer;\n" +
                    "(b) A Presiding Officer and an Assistant Presiding Officer;\n" +
                    "(C) A Returning Officer and an Assistant Returning Officer;\n" +
                    "(d) A Poll clerk and Assistant Poll Clerk;\n" +
                    "(e) An Orderly; and\n" +
                    "(f) Any other officer appointed under Part II of this Law.\n" +
                    "Offences by Law Enforcement Agents\n" +
                    "(1) A person in this section, who is under a duty to discharge a function relating to\n" +
                    "an election shall, if he, without reasonable cause, before, during or after an\n" +
                    "Election:\n" +
                    "(a) Fails to perform or discharge his duty;\n" +
                    "(b) Performs his duty fraudulency, negligently or recklessly, commits an offence\n" +
                    "and is liable on conviction to a fine of Ni 50,000 or imprisonment for a Term of\n" +
                    "3 years or to both.\n" +
                    "(2) The persons to whom this second applies are:\n" +
                    "(a) Police Officers;\n" +
                    "(b) Members of the State Security Service;\n" +
                    "(c) Party Agents; and\n" +
                    "(d) Any other officer appointed to discharge a function relating to the election.\n" +
                    "Requirement of Secrecy\n" +
                    "(1) Every Electoral officer, Assistant Electoral officer, Returning Officer,\n" +
                    "Assistant Returning officer, Presiding Officer, Poll clerk, Assistant Poll Clerk\n" +
                    "under part II of this Law concerned in the conduct of local government election\n" +
                    "in the state and, every Polling Agent or candidate in attendance at polling\n" +
                    "station or unit, at the counting of votes, shall maintain and aid in maintaining\n" +
                    "the secrecy of the voting.\n" +
                    "(2) An officer, agent or a candidate in subsection (1) shall not, except for a\n" +
                    "purpose authorized by Law, communicate to a person before the poll is closed,\n" +
                    "any information as to the name or number on the register of voters of the voter\n" +
                    "who has or has not voted at the place of voting. \n" +
                    "(3) No person shall:\n" +
                    "(a) Interfere with a voter when the voter is casting his vote unless the voter\n" +
                    "requests for assistance;\n" +
                    "(b) Obtain or attempt to obtain, in a place of voting, any information as to the\n" +
                    "candidate whom a voter is about to vote or has voted for unless while assisting\n" +
                    "the voter to cast his vote;\n" +
                    "(c) Communicate to another person any information obtained while assisting a\n" +
                    "voter as to the candidate whom the voter has voted or is about to vote for or\n" +
                    "(d) Communicate to any person information obtained in the place of voting as\n" +
                    "to the candidate whom a voter is about to vote or has voted for.\n" +
                    "(4) A person who contravenes this Section commits an offence and is liable on\n" +
                    "conviction to imprisonment for a term of 3 years or a fine of N150,000.OO or\n" +
                    "both.\n" +
                    "Corrupt Practices\n" +
                    "(1) Corrupt practice’ in this Law means:\n" +
                    "(a) Imprisonment;\n" +
                    "(b) Treating;\n" +
                    "(c) Undue influence;\n" +
                    "(d) Bribery; or\n" +
                    "(e) Aiding, abetting, counseling or procuring the commission of any offence in\n" +
                    "paragraphs (a) to (b) of this subsection.\n" +
                    "(2) A candidate who engages in corrupt practice or if the corrupt practice is committed\n" +
                    "with:\n" +
                    "(a) His knowledge or consent or\n" +
                    "(b) The knowledge or consent of a person who is acting under the general or specific\n" +
                    "authority of the candidate, Commits an offence.\n" +
                    "Impersonating another voter\n" +
                    "(1) A person who at an election:\n" +
                    "(a) Applies for a ballot paper in the name of another person, whether the person is\n" +
                    "living or dead, or fictitious;\n" +
                    "(b) Having voted once at the election, applies at that election for a ballot paper in\n" +
                    "his own name or in the name of another person, whether the person is living or\n" +
                    "dead, or fictitious;\n" +
                    "© Votes in the name of another person, whether the person is living or dead, or\n" +
                    "fictitious; or\n" +
                    "(d) Having voted once at the election, voted a second time in his own name, or in\n" +
                    "the name of another person, whether the person is living or dead, or fictitious,\n" +
                    "Commits an offence of impersonation.\n" +
                    "(2) A person who commits an offence of impersonation or aiding, abetting,\n" +
                    "counseling or procuring the commission of the offence, is liable on conviction to\n" +
                    "imprisonment for a term of one year or a fine of N50,000 or both. \n" +
                    "(3) A person charged with the offence of impersonation shall not be convicted\n" +
                    "except on the evidence of at least 2 witnesses.\n" +
                    "Prohibition of offering or accepting entertainment\n" +
                    "(1) A person who corruptly by himself or any other person, before, during or after an\n" +
                    "election, directly or indirectly gives, provides, pays wholly or in part, the\n" +
                    "expense of giving or providing any food, drinks, entertainment or provisions to\n" +
                    "or for any person:\n" +
                    "(a) For the purpose of corruptly influencing that person, or any other person to\n" +
                    "vote or refrain from voting; or\n" +
                    "(b) On account of that person or any other person, having voted or refrained\n" +
                    "from voting, at the election, commits an offence of treating.\n" +
                    "(2) Pursuant to subsection (1), a voter who corruptly accepts or takes any food,\n" +
                    "drink, entertainment or provision at an election commits an offence of treating.\n" +
                    "Undue influence\n" +
                    "(1) A person who:\n" +
                    "(a) Directly or indirectly, by himself or another person on his behalf:\n" +
                    "(I) Makes use of or threatens to make use of any force, violence, or restraint; or\n" +
                    "(ii) Inflicts or threatens to make use of any force, violence, or restraint;\n" +
                    "(b) Inflicts or threatens to inflict by himself or another person, any injury, damage,\n" +
                    "harm or loss, against a person in order to induce or compel the person to vote or\n" +
                    "refrain from voting, or on account of that person having voted or refrained from\n" +
                    "voting; or\n" +
                    "(c) By abduction, duress or a fraudulent device or contrivance impedes or prevents\n" +
                    "the free use of the vote by a voter or compels, induces or prevails on a voter to\n" +
                    "give or refrain from gMng his vote at an election, commits an offence of undue\n" +
                    "influence.\n" +
                    "Bribery\n" +
                    "(1) A person who:\n" +
                    "(a) Directly or indirectly by himself or another person on his behalf:\n" +
                    "(i) Gives, lends or agrees to give or lend, or offers or promises to procure or to\n" +
                    "endeavor to procure, any money or valuable consideration to or for any votes,\n" +
                    "or to or for any person, in order to induce the voter to vote or refrain from\n" +
                    "voting; or\n" +
                    "(ii) Corruptly does an act, referred to in sub-paragraph (a) (i) on account of the\n" +
                    "voter having voted to refrained from voting;\n" +
                    "(b) Directly or indirectly, by himself or another person on his behalf, corruptly\n" +
                    "(i) Gives or procures, or promises to procure or to endeavour to procure, any\n" +
                    "office, place, employment to or for a voter or to or for a person, in order to\n" +
                    "induce the voter to vote or refrain from voting;\n" +
                    "(ii) Does an act referred to sub-paragraph (b)(i) on account of a voter having\n" +
                    "voted or refrained from voting; \n" +
                    "(c) Directly or indirectly, by himself or another person on his behalf, makes any\n" +
                    "gift, loan, offer, promise, procurement or agreement to or for any person or\n" +
                    "community in order to induce the person or community to procure or to\n" +
                    "endeavor to procure the return of a person as a member of a Local Government\n" +
                    "Council or the vote of a voter;\n" +
                    "(d) In consequence of any gift, loan, promise, procurement or agreement, procure\n" +
                    "or engages or promises or endeavours to procure, the return of a person as a\n" +
                    "member of a Local Government Council or the vote of a voter;\n" +
                    "(e) Advances or pays, or causes to be advanced or paid any money to or for the\n" +
                    "use of a person, with the intent that the money or any part of the money, shall\n" +
                    "be expanded in bribery;\n" +
                    "(f) Knowingly pays or causes to be paid, any money to a person in discharge or\n" +
                    "repayment of any money, wholly or in part, expended in bribery; or\n" +
                    "(g) After an election, directly or directly, by himself or another person on his\n" +
                    "behalf receives any money or valuable consideration or on account of any\n" +
                    "person having voted or refrained from voting, or having induced another person\n" +
                    "to vote or refrain from voting, at an election, commits an offence of bribery.\n" +
                    "(2) A voter who, before or during an election, directly or indirectly by himself or\n" +
                    "another person on his behalf receives, agrees or contracts for any money, gift,\n" +
                    "loan or valuable consideration, office, places or employment, for himself or for\n" +
                    "another person, for voting or agreeing to vote or for refraining from voting at\n" +
                    "an election, commits an offence of bribery.\n" +
                    "(3) This section shall not extend or be construed to extend to any money paid or\n" +
                    "agreed to be paid for or on account of any legal expenses bona fide incurred at\n" +
                    "or concerning an election.\n")
            chapterSeven.add("Punishment for accepting entertainment, undue influence and bribery, etc.\n" +
                    "(1) A person who contravenes sections 66, 67 and 68 or aids, abets, counsels or\n" +
                    "procures the commission of any of those offences, commits an offence arid is\n" +
                    "liable on conviction to imprisonment for a term of one year or a fine of N50,000 or\n" +
                    "both.\n" +
                    "(2) A person convicted under 65 and 69 (1), in addition to any punishment. is not\n" +
                    "eligible, for a period of 5 years from the date of his conviction to:\n" +
                    "(a) Be registered as a voter or to vote at any Local Government Election in the\n" +
                    "State;\n" +
                    "(b) Be elected as a member of a Local Government Council; or\n" +
                    "(C) Retain his seat, if he was elected before his conviction. \n" +
                    "Offences relating to nomination papers, ballot papers, etc. and ballot boxes\n" +
                    "(1) A person who:\n" +
                    "(a) Forges, fraudulently defaces or fraudulently destroys a nomination paper,\n" +
                    "or delivers to an officer charged with the conduct of an election, a\n" +
                    "nomination paper, knowing the paper to be forged.\n" +
                    "(b) Forges. counterfeits or fraudulently destroys a ballot paper or the official\n" +
                    "mark on a ballot paper or statement of result;\n" +
                    "(c) Without due authority, gives a ballot paper to a person;\n" +
                    "(d) Fraudulently puts into a ballot box a paper which is not authorized by law\n" +
                    "to put;\n" +
                    "(e) Fraudulently takes out of the polling station or unit a ballot paper; or\n" +
                    "(f) Without due authority, destroys, takes or interferes with a ballot box or\n" +
                    "ballot papers in use for an election, commits an offence.\n" +
                    "(2) A person who: contravenes subsection (1) commits an offence and liable on\n" +
                    "conviction to imprisonment for a term of 2 years or fine of N 100,000 or both.\n" +
                    "(3) An attempt to commit an offence under this section is punishable in the same\n" +
                    "manner which the offence itself is punishable.\n" +
                    "(4) Where an offence is prosecuted in relation to nomination paper, ballot box,\n" +
                    "ballot paper or the marking instrument at an election, the property in the\n" +
                    "paper, box or instrument shall be stated to be that of the officer charged with\n" +
                    "the conduct of the election.\n" +
                    "Punishment relating to certain illegal practices\n" +
                    "A person who:\n" +
                    "(a) Votes, induces or procures any person to vote at an election knowing that the\n" +
                    "person is prohibited by the Rivers State Independent Electoral Commission\n" +
                    "Law No.2 of 2018 or by other law, from voting at the election; or\n" +
                    "(b) Before or during the election, knowingly or recklessly publishes a false\n" +
                    "statement of the withdrawal of a candidate, at the election for the purpose of\n" +
                    "promoting or procuring the election of another candidate, Commits an offence\n" +
                    "and is liable on conviction k imprisonment for a term of one year or a fine of\n" +
                    "N50,000 or both. \n" +
                    "Punishment relating to voting when not registered\n" +
                    "A person who will fully votes at a Local Government Election in a ward where his\n" +
                    "name does not appear on the register of voters, commits an offence and is liable on\n" +
                    "conviction to imprisonment for a term of one year or a fine of N50,000 or both.\n" +
                    "Fraudulent use of ballot paper\n" +
                    "1. A person who is issued with a ballot paper in a polling station or unit, and takes\n" +
                    "or attempts to take the ballot paper of the polling station or unit commits an\n" +
                    "offence and is liable on conviction to imprisonment for a term of one year or a\n" +
                    "fine of N50,000 or both.\n" +
                    "2. A person who, at an election, brings into a polling station or unit a ballot paper\n" +
                    "relating to the election issued to another person commits an offence and is\n" +
                    "liable on conviction to imprisonment for a term of one year or a fine of\n" +
                    "N50,000 or both.\n" +
                    "3. For the purpose of sections 66 & 67, the expression. “refrain from voting”\n" +
                    "include taking a ballot paper out of a. polling station or unit contrary to\n" +
                    "subsection (1) of this section.\n" +
                    "4. Where the Presiding Officer in a polling station or unit has reason to suspect\n" +
                    "that a person issued with a ballot paper is about to leave a polling station or unit\n" +
                    "and has the ballot paper in his possession, the P(esiding Officer or a person\n" +
                    "acting under his direction may search the person with the ballot paper.\n" +
                    "Offences relating to statement of result\n" +
                    "A Presiding Officer at an election who:\n" +
                    "(a) Gives a certificate or statement of result which, to his knowledge, is false in a\n" +
                    "material particular;\n" +
                    "(b) Perversely and without Lawful excuse, refuses to give a statement of result of\n" +
                    "the election to the officer to whom the result is required to be devered;\n" +
                    "(c) Does an act that obstructs the proper counting or obtaining of the correct result\n" +
                    "of the election, commits an offence and is liable on conviction to imprisonment\n" +
                    "for a term 2 years or fine of Ni 00,000 or both.\n" +
                    "Disqualification of persons convicted of certain offences\n" +
                    "A person convicted of an offence under section 66,70,71,72,73 or 74, in addition to\n" +
                    "any other punishment, shall not be eligible for a period of 3 years from the date of his\n" +
                    "conviction to:\n" +
                    "(a) Vote at any Local Government Election in the State;\n" +
                    "(b) Be elected as a member of a Local Government Council; or\n" +
                    "(c) Retain his seat, if elected before his conviction.\n" +
                    "Disorderly conduct at elections\n" +
                    "A person who, at any polling station, unit or place being used for the counting of\n" +
                    "votes, acts or incites any other person to act in a disorderly manner commits an\n" +
                    "offence and is liable on conviction to imprisonment for a term of one year or a fine of\n" +
                    "N50,000 or both.\n" +
                    "Certain prohibition on polling day\n" +
                    "(1) No person shall on any date on which a Local Government Council election is to\n" +
                    "hold:\n" +
                    "(a) Convene, hold or attend a public meeting in that Local Government Area; or\n" +
                    "(b) Operate any megaphone, amplifier or any other public address apparatus in\n" +
                    "that Local Government Area for the purpose of making announcement\n" +
                    "concerning the election exact where apparatus is operated by an officer\n" +
                    "appointed under this Law, for the purpose of making official announcement\n" +
                    "relating to the election.\n" +
                    "(2) No person shall, on any date on which a poll is to be taken at a polling station or\n" +
                    "unit:\n" +
                    "(a) Canvass for votes;\n" +
                    "(b) Solicit the vote of a voter;\n" +
                    "(c) Persuade a voter not to vote for a particular candidate;\n" +
                    "(d) Persuade a voter not to vote at the election;\n" +
                    "(e) Shout, exhibit or tender a notice, sign, symbol, slogan, badge, photograph or\n" +
                    "party card referring to the election; or\n" +
                    "(f) Shout slogans concerning the election within the polling station or unit or in\n" +
                    "a public or private place within a distance of 200 metres of the polling\n" +
                    "station or unit.\n" +
                    "(3) No candidate or any other person, with the connivance of a candidate, shall,\n" +
                    "whether on payment or non-payment, use, hire or procure any vessel or vehicle\n" +
                    "for the conveyance of a voter, but the candidate can convey himself or his agent,\n" +
                    "to or from a polling station or unit.\n" +
                    "(4) No person shall bring alcoholic liquor into or consume alcoholic liquor in a\n" +
                    "polling station or unit, or in a place being used for the counting of votes.\n" +
                    "(5) A person who contravenes subsection (1), (2), (3), or (4) commits an offence and\n" +
                    "is liable on conviction to imprisonment for a term of one year or a fine of\n" +
                    "N50,000 or both.\n" +
                    "Offences relating to counting of votes\n" +
                    "A candidate or an agent who records the serial number of a rejected ballot paper or of\n" +
                    "a ballot paper in contravention of the provisions of this Law commits an offence and\n" +
                    "is liable on conviction to imprisonment for a term of one year or a fine of N500,000 or\n" +
                    "both.\n" +
                    "Disturbance at public meeting\n" +
                    "A person who at a lawful public meeting to which this Law applies:\n" +
                    "(a) Acts or incites any other person to act in a disorderly manner for the purpose of\n" +
                    "preventing the transaction of the business for which the meeting was called; or\n" +
                    "(b) Has in his possession an offensive weapon or missile, commits an offence and\n" +
                    "is liable on conviction to imprisonment for term of 5 years or a fine of\n" +
                    "N500,000 or both. \n" +
                    "Conviction of disqualifying offence to be reported, etc.\n" +
                    "Where a person IS convicted of an offence under this Law which disqualifies him\n" +
                    "from being elected as a member of a Local Government Council, the court which\n" +
                    "convicted him shall send to the Commission the judgment of the conviction and where\n" +
                    "the person convicted has appealed, the court which heard the appeal shall within 3\n" +
                    "months send the judgment of the appeal to the Commission\n" +
                    "Punishment for attempts, etc., to commit offence\n" +
                    "An attempt or a conspiracy to commit an offence specified in this Law is punishable\n" +
                    "in the same manner as the offence.\n" +
                    "Prosecution of offences\n" +
                    "(1) An offence committed under this part is triable in a Magistrates Court,\n" +
                    "(2) A prosecution under this part shall be undertaken by:\n" +
                    "(a) The Attorney-General of the State or a State Counsel in the Ministry of Justice; or\n" +
                    "(b) An officer of the Nigerian Police Force. ")


            expandableListDetail["CHAPTER 3"] = myFavCricketPlayers
            expandableListDetail["CHAPTER 4"] = chapterFour
            expandableListDetail["CHAPTER 5"] = chapterFive
            expandableListDetail["CHAPTER 6"] = chapterSix
            expandableListDetail["CHAPTER 6"] = chapterSeven
            expandableListDetail["CHAPTER 1"] = myFavTennisPlayers
            expandableListDetail["CHAPTER 2"] = myFavFootballPlayers

            return expandableListDetail
        }
}