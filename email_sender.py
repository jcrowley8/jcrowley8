from email.message import EmailMessage
import ssl
import smtplib

email_sender = 'stevejobs09262000@gmail.com'
email_password = 'rxkkdkvmrfzstuxr'
    
email_receiver = 'jaredcrowley08@gmail.com'

subject = "Test`"
body = """
hell0 world
"""

em = EmailMessage()
em['From'] = email_sender
em['TO'] = email_receiver
em['subject'] = subject
em.set_content(body)


context = ssl.create_default_context()

with smtplib.SMTP_SSL('smtp.gmail.com', 465, context=context) as smtp:
    smtp.login(email_sender, email_password)
    smtp.sendmail(email_sender, email_receiver, em.as_string())