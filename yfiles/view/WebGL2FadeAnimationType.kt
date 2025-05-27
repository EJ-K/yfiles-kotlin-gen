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
 * Defines types of fading animations for use with the [WebGL2GraphModelManager.createFadeAnimation] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FadeAnimationType">Online Documentation</a>
 */
external sealed class WebGL2FadeAnimationType: YEnum<WebGL2FadeAnimationType> {
   companion object: EnumMetadata<WebGL2FadeAnimationType> {
       /**
 * Fading out to a transparent or semi-transparent visualization.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FadeAnimationType%23FADE_OUT">Online Documentation</a>
 */
val FADE_OUT: WebGL2FadeAnimationType

/**
 * Fading out to a low contrast grayscale version of the visualization.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FadeAnimationType%23FADE_TO_GRAY">Online Documentation</a>
 */
val FADE_TO_GRAY: WebGL2FadeAnimationType

/**
 * Fading to a specifically colored version of the visualization.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FadeAnimationType%23FADE_TO_COLOR">Online Documentation</a>
 */
val FADE_TO_COLOR: WebGL2FadeAnimationType

/**
 * Fading in from a transparent or semi-transparent visualization.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FadeAnimationType%23FADE_IN">Online Documentation</a>
 */
val FADE_IN: WebGL2FadeAnimationType

/**
 * Fading in from a low contrast grayscale version of the visualization.
 * 
 * Value - `10`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FadeAnimationType%23FADE_FROM_GRAY">Online Documentation</a>
 */
val FADE_FROM_GRAY: WebGL2FadeAnimationType

/**
 * Fading from a specifically colored version of the visualization.
 * 
 * Value - `12`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2FadeAnimationType%23FADE_FROM_COLOR">Online Documentation</a>
 */
val FADE_FROM_COLOR: WebGL2FadeAnimationType
   }
}
