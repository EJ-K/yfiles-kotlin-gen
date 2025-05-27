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
 * @see [OrthogonalLayout.chainStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainLayoutStyle">Online Documentation</a>
 */
external sealed class ChainLayoutStyle: YEnum<ChainLayoutStyle> {
   companion object: EnumMetadata<ChainLayoutStyle> {
       /**
 * A chain layout style that defines that chains should not be handled specifically.
 * 
 * Value - `0`
 * @see [OrthogonalLayout.chainStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainLayoutStyle%23NONE">Online Documentation</a>
 */
val NONE: ChainLayoutStyle

/**
 * A chain layout style that defines that chains are arranged in a straight fashion.
 * 
 * Value - `1`
 * @see [OrthogonalLayout.chainStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainLayoutStyle%23STRAIGHT">Online Documentation</a>
 */
val STRAIGHT: ChainLayoutStyle

/**
 * A chain layout style that defines that chains are line/column-wrapped such that nodes form the turns/corners of the chain arrangement.
 * 
 * Value - `2`
 * @see [OrthogonalLayout.chainStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainLayoutStyle%23WRAPPED_WITH_NODES_AT_TURNS">Online Documentation</a>
 */
val WRAPPED_WITH_NODES_AT_TURNS: ChainLayoutStyle

/**
 * A chain layout style that defines that chains are line/column wrapped such that bends of the chain edges form the turns/corners of the chain arrangement.
 * 
 * Value - `3`
 * @see [OrthogonalLayout.chainStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainLayoutStyle%23WRAPPED_WITH_BENDS_AT_TURNS">Online Documentation</a>
 */
val WRAPPED_WITH_BENDS_AT_TURNS: ChainLayoutStyle
   }
}
