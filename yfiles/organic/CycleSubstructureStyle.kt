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
 * Enum constants to define the cycle substructure style in the [OrganicLayout]
 * @see [OrganicLayout.cycleSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleSubstructureStyle">Online Documentation</a>
 */
external sealed class CycleSubstructureStyle: YEnum<CycleSubstructureStyle> {
   companion object: EnumMetadata<CycleSubstructureStyle> {
       /**
 * Substructure style specifier for cycle structures that indicates that the algorithm does not handle such structures in a special way.
 * 
 * Value - `0`
 * @see [OrganicLayout.cycleSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleSubstructureStyle%23NONE">Online Documentation</a>
 */
val NONE: CycleSubstructureStyle

/**
 * Substructure style specifier for cycle structures that leads to a circular layout style.
 * 
 * Value - `5`
 * @see [OrganicLayout.cycleSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleSubstructureStyle%23CIRCULAR">Online Documentation</a>
 */
val CIRCULAR: CycleSubstructureStyle

/**
 * Substructure style specifier for cycle structures that leads to a circular layout style and where cycles are allowed to be nested inside other substructures.
 * 
 * Value - `9`
 * @see [OrganicLayout.cycleSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleSubstructureStyle%23CIRCULAR_NESTED">Online Documentation</a>
 */
val CIRCULAR_NESTED: CycleSubstructureStyle
   }
}
