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
 * Enum constants to define the star substructure style in the [OrganicLayout]
 * @see [OrganicLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutStarSubstructureStyle">Online Documentation</a>
 */
external sealed class OrganicLayoutStarSubstructureStyle: YEnum<OrganicLayoutStarSubstructureStyle> {
   companion object: EnumMetadata<OrganicLayoutStarSubstructureStyle> {
       /**
 * Substructure style specifier for stars that indicates that the algorithm does not handle such structures in a special way.
 * 
 * Value - `0`
 * @see [OrganicLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutStarSubstructureStyle%23NONE">Online Documentation</a>
 */
val NONE: OrganicLayoutStarSubstructureStyle

/**
 * Substructure style specifier for stars that leads to a radial layout style for stars where the root is placed in the middle.
 * 
 * Value - `3`
 * @see [OrganicLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutStarSubstructureStyle%23RADIAL">Online Documentation</a>
 */
val RADIAL: OrganicLayoutStarSubstructureStyle

/**
 * Substructure style specifier for stars that leads to a radial layout style for stars where the root is placed on the outside (separated from the nodes with degree one).
 * 
 * Value - `4`
 * @see [OrganicLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutStarSubstructureStyle%23SEPARATED_RADIAL">Online Documentation</a>
 */
val SEPARATED_RADIAL: OrganicLayoutStarSubstructureStyle

/**
 * Substructure style specifier for stars that leads to a circular layout style for stars where the root is placed in the middle.
 * 
 * Value - `5`
 * @see [OrganicLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutStarSubstructureStyle%23CIRCULAR">Online Documentation</a>
 */
val CIRCULAR: OrganicLayoutStarSubstructureStyle

/**
 * Substructure style specifier for stars that leads to a radial layout style for stars where the root is placed in the middle and the stars may be nested inside other substructures.
 * 
 * Value - `8`
 * @see [OrganicLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutStarSubstructureStyle%23RADIAL_NESTED">Online Documentation</a>
 */
val RADIAL_NESTED: OrganicLayoutStarSubstructureStyle

/**
 * Substructure style specifier for stars that leads to a circular layout style for stars where the root is placed in the middle and stars may be nested inside other substructures.
 * 
 * Value - `9`
 * @see [OrganicLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutStarSubstructureStyle%23CIRCULAR_NESTED">Online Documentation</a>
 */
val CIRCULAR_NESTED: OrganicLayoutStarSubstructureStyle
   }
}
