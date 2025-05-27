// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.orthogonal

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [OrthogonalLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutStyle">Online Documentation</a>
 */
@JsName("OrthogonalLayoutStyle")
external sealed class LayoutStyle: YEnum<LayoutStyle> {
   companion object: EnumMetadata<LayoutStyle> {
       /**
 * A layout style that produces orthogonal edges while maintaining the original node size.
 * 
 * Value - `0`
 * @see [OrthogonalLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutStyle%23NORMAL">Online Documentation</a>
 */
val NORMAL: LayoutStyle

/**
 * A layout style that produces orthogonal edges and nodes of uniform size.
 * 
 * Value - `1`
 * @see [OrthogonalLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutStyle%23UNIFORM">Online Documentation</a>
 */
val UNIFORM: LayoutStyle

/**
 * A layout style that modifies the size of nodes to minimize the overall number of bends.
 * 
 * Value - `2`
 * @see [OrthogonalLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutStyle%23BOX">Online Documentation</a>
 */
val BOX: LayoutStyle

/**
 * A layout style that produces non-orthogonal edges and resizes the nodes to a small uniform size.
 * 
 * Value - `3`
 * @see [OrthogonalLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutStyle%23MIXED">Online Documentation</a>
 */
val MIXED: LayoutStyle

/**
 * A layout style similar to [MIXED] that maintains the original node size.
 * 
 * Value - `5`
 * @see [OrthogonalLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutStyle%23FIXED_MIXED">Online Documentation</a>
 */
val FIXED_MIXED: LayoutStyle

/**
 * A layout style similar to [BOX] that maintains the original node size.
 * 
 * Value - `6`
 * @see [OrthogonalLayout.layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutStyle%23FIXED_BOX">Online Documentation</a>
 */
val FIXED_BOX: LayoutStyle
   }
}
