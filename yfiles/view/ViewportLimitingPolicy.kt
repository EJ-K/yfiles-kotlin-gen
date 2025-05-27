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
 * Defines how [ViewportLimiter] should [limit][ViewportLimiter.limitViewport] the suggested [CanvasComponent.viewport].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimitingPolicy">Online Documentation</a>
 */
external sealed class ViewportLimitingPolicy: YEnum<ViewportLimitingPolicy> {
   companion object: EnumMetadata<ViewportLimitingPolicy> {
       /**
 * Strictly applies the bounds.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimitingPolicy%23STRICT">Online Documentation</a>
 */
val STRICT: ViewportLimitingPolicy

/**
 * If the current [CanvasComponent.viewport] lies outside the [ViewportLimiter.bounds] the [ViewportLimiter] allows for changes towards the [ViewportLimiter.bounds] but forbids changes away from them.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimitingPolicy%23TOWARDS_LIMIT">Online Documentation</a>
 */
val TOWARDS_LIMIT: ViewportLimitingPolicy
   }
}
