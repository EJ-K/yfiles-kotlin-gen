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
 * Defines types of scale animations for use with the [WebGL2GraphModelManager.createScaleAnimation] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ScaleAnimationType">Online Documentation</a>
 */
external sealed class WebGL2ScaleAnimationType: YEnum<WebGL2ScaleAnimationType> {
   companion object: EnumMetadata<WebGL2ScaleAnimationType> {
       /**
 * Scale animation between the current size of an element or effect and a larger size defined by the amount.
 * 
 * Value - `14`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ScaleAnimationType%23GROW">Online Documentation</a>
 */
val GROW: WebGL2ScaleAnimationType

/**
 * Scale animation between the current size of an element or effect and a smaller size defined by the amount.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ScaleAnimationType%23SHRINK">Online Documentation</a>
 */
val SHRINK: WebGL2ScaleAnimationType

/**
 * Scale animation between the current size of an element or effect and a scaled up size defined by the amount as a factor.
 * 
 * Value - `34`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ScaleAnimationType%23GROW_RELATIVE">Online Documentation</a>
 */
val GROW_RELATIVE: WebGL2ScaleAnimationType

/**
 * Scale animation between the current size of an element or effect and a scaled up size defined by the amount as factor.
 * 
 * Value - `36`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ScaleAnimationType%23SHRINK_RELATIVE">Online Documentation</a>
 */
val SHRINK_RELATIVE: WebGL2ScaleAnimationType
   }
}
