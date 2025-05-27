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
 * Defines types of shake animations for use with the [WebGL2GraphModelManager.createShakeAnimation] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShakeAnimationType">Online Documentation</a>
 */
external sealed class WebGL2ShakeAnimationType: YEnum<WebGL2ShakeAnimationType> {
   companion object: EnumMetadata<WebGL2ShakeAnimationType> {
       /**
 * Shake animation in horizontal direction.
 * 
 * Value - `12`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShakeAnimationType%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: WebGL2ShakeAnimationType

/**
 * Shake animation in vertical direction.
 * 
 * Value - `13`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ShakeAnimationType%23VERTICAL">Online Documentation</a>
 */
val VERTICAL: WebGL2ShakeAnimationType
   }
}
