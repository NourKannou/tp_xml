<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/tns:BanqueService">
    <html>
      <head>
        <title>Liste des comptes</title>
      </head>
      <body>
        <h1>Liste des comptes</h1>
        <table border="1">
          <tr>
            <th>Code</th>
            <th>Solde</th>
            <th>Date de Création</th>
          </tr>
          <xsl:for-each select="tns:getComptes">
            <tr>
              <td><xsl:value-of select="tns:code"/></td>
              <td><xsl:value-of select="tns:solde"/></td>
              <td><xsl:value-of select="tns:dataCreation"/></td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
