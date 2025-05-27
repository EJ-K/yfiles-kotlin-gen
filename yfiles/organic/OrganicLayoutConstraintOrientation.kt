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
 * Enum constants to define the orientation axis of constraints defined via [OrganicLayoutConstraintFactory].
 * @see [OrganicLayoutConstraintFactory.addAlignmentConstraint]
 * @see [OrganicLayoutConstraintFactory.addFixedDistances]
 * @see [OrganicLayoutConstraintFactory.addMaximumDistanceConstraint]
 * @see [OrganicLayoutConstraintFactory.addOrderConstraint]
 * @see [OrganicLayoutConstraintFactory.addRegularAlignmentConstraint]
 * @see [OrganicLayoutConstraintFactory.addSeparationConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintOrientation">Online Documentation</a>
 */
external sealed class OrganicLayoutConstraintOrientation: YEnum<OrganicLayoutConstraintOrientation> {
   companion object: EnumMetadata<OrganicLayoutConstraintOrientation> {
       /**
 * Orientation specifier representing the direction parallel to the x-Axis
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintOrientation%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: OrganicLayoutConstraintOrientation

/**
 * Orientation specifier representing the direction parallel to the y-Axis
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintOrientation%23VERTICAL">Online Documentation</a>
 */
val VERTICAL: OrganicLayoutConstraintOrientation

/**
 * Orientation specifier representing the directions parallel to both axes
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutConstraintOrientation%23BOTH">Online Documentation</a>
 */
val BOTH: OrganicLayoutConstraintOrientation
   }
}
