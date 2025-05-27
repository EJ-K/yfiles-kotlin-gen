// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Self-loop style specifier which defines that the routes of self-loops are rounded.
 * @see [SelfLoopRouter.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopStyle">Online Documentation</a>
 */
external sealed class SelfLoopStyle: YEnum<SelfLoopStyle> {
   companion object: EnumMetadata<SelfLoopStyle> {
       /**
 * Self-loop style specifier which defines that the routes of self-loops are orthogonal.
 * 
 * Value - `0`
 * @see [SelfLoopRouter.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopStyle%23ORTHOGONAL">Online Documentation</a>
 */
val ORTHOGONAL: SelfLoopStyle

/**
 * Self-loop style specifier which defines that the routes of self-loops are rounded.
 * 
 * Value - `1`
 * @see [SelfLoopRouter.layoutStyle]
 * @see [SelfLoopRouter.lineDistance]
 * @see [SelfLoopRouter.cornerApproximationPointsCount]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopStyle%23ROUNDED">Online Documentation</a>
 */
val ROUNDED: SelfLoopStyle
   }
}
