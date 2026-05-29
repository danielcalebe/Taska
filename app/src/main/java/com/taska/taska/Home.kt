package com.taska.taska

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Task
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Home(verKanban: () -> Unit, cadastrar: () -> Unit, gerarRelatorio: () -> Unit) {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(MaterialTheme.colorScheme.background)
  ) {
    Box(
      modifier = Modifier.fillMaxSize()
    ) {
      Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.End,

        verticalArrangement = Arrangement.Bottom
      ) {
        Image(
          painter = painterResource(R.drawable.logo_crop),
          null,
          modifier = Modifier
            .size(400.dp)
            .offset(120.dp, 54.dp)
            .alpha(0.6f),
          contentScale = ContentScale.Crop
        )
      }
      Column(
        modifier = Modifier
          .fillMaxSize()
          .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
      ) {
        Row(
          Modifier.fillMaxWidth(),
          horizontalArrangement = Arrangement.SpaceBetween,
          verticalAlignment = Alignment.CenterVertically
        ) {
          Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
          ) {
            Icon(Icons.Default.Home, null)
            Column() {
              Text(
                "Taska",
                style = MaterialTheme.typography.titleLarge.copy(
                  fontWeight = FontWeight.Bold,
                  fontSize = 28.sp
                )
              )
              Text("HOME", fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 4.dp))
            }
          }
          Image(painterResource(R.drawable.logo_crop), null, modifier = Modifier.size(48.dp))
        }

        Row(
          modifier = Modifier.fillMaxWidth(),
          verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.Center
        ) {
          Image(
            painter = painterResource(R.drawable.logo),
            null,
            modifier = Modifier.fillMaxWidth(0.8f)

          )
        }
        Row(
          modifier = Modifier.fillMaxWidth(),
          verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

          Column(
            modifier = Modifier
              .weight(1f)
              .clickable(onClick = { cadastrar() })
              .clip(RoundedCornerShape(8.dp))
              .background(MaterialTheme.colorScheme.primary)
              .padding(12.dp)
          ) {
            Text("Cadastrar \natividade", fontWeight = FontWeight.SemiBold)
            Icon(Icons.Default.Create, null)
          }

          Column(
            modifier = Modifier
              .weight(1f)
              .clickable(onClick = { verKanban() })
              .clip(RoundedCornerShape(8.dp))
              .background(MaterialTheme.colorScheme.secondary)
              .padding(12.dp)
          ) {
            Text("Ver \nKanban", fontWeight = FontWeight.SemiBold)
            Icon(Icons.Default.Task, null)
          }
          Column(
            modifier = Modifier
              .weight(1f)
              .clickable(onClick = { gerarRelatorio() })
              .clip(RoundedCornerShape(8.dp))
              .background(MaterialTheme.colorScheme.onSurface)
              .padding(12.dp)
          ) {
            Text(
              "Gerar \nrelatório",
              fontWeight = FontWeight.SemiBold,
              color = MaterialTheme.colorScheme.background
            )
            Icon(Icons.Default.Send, null, tint = MaterialTheme.colorScheme.background)
          }

        }
      }
    }
  }
}