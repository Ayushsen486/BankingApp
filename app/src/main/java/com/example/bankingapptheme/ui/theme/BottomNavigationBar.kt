
//code for bottom navigation bar
package com.example.bankingapptheme.ui.theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

val items = listOf(
BottomNavigation(
    title = "Home",
    icon = Icons.Rounded.Home
),
    BottomNavigation(
        title = "Wallet",
        icon = Icons.Rounded.Wallet
    ),
    BottomNavigation(
        title = "Notifications",
        icon = Icons.Rounded.Notifications

    ),
                BottomNavigation(
                title = "Account",
        icon = Icons.Rounded.AccountCircle
    ),
)



@Preview
@Composable
   public fun BottomNavigationBar()
{
    NavigationBar {
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)

        ) { items  .forEachIndexed { index, items ->
            NavigationBarItem(
                selected = index == 0,
                onClick = {},
                icon = {
                     
                    Icon(
                        imageVector = items.icon,
                        contentDescription = items.title,
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                }

            )
        }
        }
    }}

