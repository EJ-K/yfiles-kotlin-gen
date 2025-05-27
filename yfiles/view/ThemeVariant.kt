// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * The variant constants used by a [Theme]s [Theme.variant].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ThemeVariant">Online Documentation</a>
 */
external sealed class ThemeVariant: YEnum<ThemeVariant> {
   companion object: EnumMetadata<ThemeVariant> {
       /**
 * The classic variant uses the well-known styling of previous yFiles for HTML versions.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ThemeVariant%23CLASSIC">Online Documentation</a>
 */
val CLASSIC: ThemeVariant

/**
 * The simple round variant uses a more simplistic styling with round shapes where applicable and hairline indicators.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ThemeVariant%23SIMPLE_ROUND">Online Documentation</a>
 */
val SIMPLE_ROUND: ThemeVariant

/**
 * The simple square variant uses a more simplistic styling with rectangular shapes where applicable and hairline indicators.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ThemeVariant%23SIMPLE_SQUARE">Online Documentation</a>
 */
val SIMPLE_SQUARE: ThemeVariant
   }
}
