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
 * Determines the policy whether and how [Visual]s are cached when they are removed temporarily from the [CanvasComponent]'s visual tree.
 * @see [CanvasComponent.visualCaching]
 * @see [IRenderContext.setDisposeCallback]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VisualCachingPolicy">Online Documentation</a>
 */
external sealed class VisualCachingPolicy: YEnum<VisualCachingPolicy> {
   companion object: EnumMetadata<VisualCachingPolicy> {
       /**
 * Disables caching of [Visual]s completely.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VisualCachingPolicy%23NEVER">Online Documentation</a>
 */
val NEVER: VisualCachingPolicy

/**
 * [Visual]s will always be cached.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VisualCachingPolicy%23ALWAYS">Online Documentation</a>
 */
val ALWAYS: VisualCachingPolicy
   }
}
