// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * [OutputRestriction]s restrict the output area and the shape of a layout in conjunction with organic layout algorithms such as [OrganicLayout] or [InteractiveOrganicLayout].
 * @see [OrganicLayout.outputRestriction]
 * @see [InteractiveOrganicLayout.outputRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputRestriction">Online Documentation</a>
 */
external abstract class OutputRestriction  : YObject {

companion object : ClassMetadata<OutputRestriction> {
/**
 * This [OutputRestriction] does not restrict the output by any means.
 * @see [OrganicLayout.outputRestriction]
 * @see [InteractiveOrganicLayout.outputRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputRestriction%23NONE">Online Documentation</a>
 */
 val NONE: OutputRestriction
/**
 * Creates an [OutputRestriction] that confines the layout result to a rectangular area which roughly complies with the given *aspect ratio*.
 * @param [ratio] the preferred aspect ratio of the output
 * @return an [OutputRestriction] imposing the given aspect ratio on the layout
 * @throws ArgumentError if the given aspect ratio is `0` or negative
 * @see [OrganicLayout.outputRestriction]
 * @see [InteractiveOrganicLayout.outputRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputRestriction%23OutputRestriction-method-createAspectRatioRestriction">Online Documentation</a>
 */
 final   fun createAspectRatioRestriction( ratio: Double ):OutputRestriction
/**
 * Creates an [OutputRestriction] that confines the layout result to a circle.
 * @param [x] the x-coordinate of the restriction circle's center
 * @param [y] the y-coordinate of the restriction circle's center
 * @param [radius] the radius of the restriction circle
 * @return the [OutputRestriction] confining the layout to a circular area
 * @throws ArgumentError if the given radius is less than or equal to zero
 * @see [OrganicLayout.outputRestriction]
 * @see [InteractiveOrganicLayout.outputRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputRestriction%23OutputRestriction-method-createCircularCageRestriction">Online Documentation</a>
 */
 final   fun createCircularCageRestriction( x: Double ,
 y: Double ,
 radius: Double ):OutputRestriction
/**
 * Creates an [OutputRestriction] that confines the layout result to an elliptical area.
 * @param [x] the x-coordinate of the bounding box's upper left corner
 * @param [y] the y-coordinate of the bounding box's upper left corner
 * @param [w] the width of the bounding box
 * @param [h] the height of the bounding box
 * @return the [OutputRestriction] confining the layout to an elliptical area
 * @throws ArgumentError if the given width or height is `0` or negative
 * @see [OrganicLayout.outputRestriction]
 * @see [InteractiveOrganicLayout.outputRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputRestriction%23OutputRestriction-method-createEllipticalCageRestriction">Online Documentation</a>
 */
 final   fun createEllipticalCageRestriction( x: Double ,
 y: Double ,
 w: Double ,
 h: Double ):OutputRestriction
/**
 * Creates an [OutputRestriction] that confines the layout to a rectangular area.
 * @param [x] the x-coordinate of the restriction rectangle's upper-left corner
 * @param [y] the y-coordinate of the restriction rectangle's upper-left corner
 * @param [w] width of the restriction rectangle
 * @param [h] height of the restriction rectangle
 * @return the [OutputRestriction] confining the layout to a rectangular area
 * @throws ArgumentError if the given width or height is less than or equal to zero
 * @see [OrganicLayout.outputRestriction]
 * @see [InteractiveOrganicLayout.outputRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OutputRestriction%23OutputRestriction-method-createRectangularCageRestriction">Online Documentation</a>
 */
 final   fun createRectangularCageRestriction( x: Double ,
 y: Double ,
 w: Double ,
 h: Double ):OutputRestriction
}
}
