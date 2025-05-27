// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enum constants to define the chain substructure style in the [OrganicLayout]
 * @see [OrganicLayout.chainSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructureStyle">Online Documentation</a>
 */
external sealed class ChainSubstructureStyle: YEnum<ChainSubstructureStyle> {
   companion object: EnumMetadata<ChainSubstructureStyle> {
       /**
 * Substructure style specifier for chains that indicates that the algorithm does not handle such structures in a special way.
 * 
 * Value - `0`
 * @see [OrganicLayout.chainSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructureStyle%23NONE">Online Documentation</a>
 */
val NONE: ChainSubstructureStyle

/**
 * Substructure style specifier for chains that leads to a compact (rotated) rectangular layout style for chains.
 * 
 * Value - `1`
 * @see [OrganicLayout.chainSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructureStyle%23RECTANGULAR">Online Documentation</a>
 */
val RECTANGULAR: ChainSubstructureStyle

/**
 * Substructure style specifier for chains that leads to a straight-line layout style for chains.
 * 
 * Value - `2`
 * @see [OrganicLayout.chainSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructureStyle%23STRAIGHT_LINE">Online Documentation</a>
 */
val STRAIGHT_LINE: ChainSubstructureStyle

/**
 * Substructure style specifier for chains that leads to a compact disk-like layout for chains.
 * 
 * Value - `3`
 * @see [OrganicLayout.chainSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructureStyle%23DISK">Online Documentation</a>
 */
val DISK: ChainSubstructureStyle

/**
 * Substructure style specifier for chains that leads to a compact (rotated) rectangular layout style for chains and where chains may be nested inside parallel substructures.
 * 
 * Value - `6`
 * @see [OrganicLayout.chainSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructureStyle%23RECTANGULAR_NESTED">Online Documentation</a>
 */
val RECTANGULAR_NESTED: ChainSubstructureStyle

/**
 * Substructure style specifier for chains that leads to a straight-line layout style for chains and where chains may be nested inside parallel substructures.
 * 
 * Value - `7`
 * @see [OrganicLayout.chainSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructureStyle%23STRAIGHT_LINE_NESTED">Online Documentation</a>
 */
val STRAIGHT_LINE_NESTED: ChainSubstructureStyle

/**
 * Substructure style specifier for chains that leads to a compact disk-like layout for chains and where chains may be nested inside parallel substructures.
 * 
 * Value - `8`
 * @see [OrganicLayout.chainSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructureStyle%23DISK_NESTED">Online Documentation</a>
 */
val DISK_NESTED: ChainSubstructureStyle
   }
}
