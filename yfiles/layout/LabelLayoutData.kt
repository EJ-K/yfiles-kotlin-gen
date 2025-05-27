// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.YOrientedRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * [LabelLayoutData] encapsulates layout information for a label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [LabelLayoutData] for a label with the given width and height.
 * @param [width] the width of the label
 * @param [height] the height of the label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData%23LabelLayoutData-constructor-LabelLayoutData(number,number)">Online Documentation</a>
 */
external open class LabelLayoutData  ( width: Double ,
 height: Double ) : YObject {
/**
 * Creates a new instance of [LabelLayoutData] for a label with the given oriented box and preferred placement descriptor.
 * @param [bounds] the box of the label
 * @param [preferredPlacement] a preferred placement descriptor
 * @see [PreferredPlacementDescriptor]
 * @see [preferredPlacementDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData%23LabelLayoutData-constructor-LabelLayoutData(YOrientedRectangle,PreferredPlacementDescriptor)">Online Documentation</a>
 */
 constructor( bounds: YOrientedRectangle ,
 preferredPlacement: PreferredPlacementDescriptor?  = definedExternally)

/**
 * Gets or sets the [oriented box][YOrientedRectangle] of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData%23bounds">Online Documentation</a>
 */
open var bounds: YOrientedRectangle
/**
 * Gets the height of the label's bounding box.
 * @see [YOrientedRectangle.boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData%23height">Online Documentation</a>
 */
open val height: Double
/**
 * Gets or sets the preferred placement of this label.
 * 
 * Default value - [PreferredPlacementDescriptor]. A descriptor that allows all placements [LabelPlacements.ANYWHERE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData%23preferredPlacementDescriptor">Online Documentation</a>
 */
open var preferredPlacementDescriptor: PreferredPlacementDescriptor
/**
 * Gets the width of the label's bounding box.
 * @see [YOrientedRectangle.boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData%23width">Online Documentation</a>
 */
open val width: Double
/**
 * Gets the x-coordinate of the upper-left corner of the label's bounding box.
 * @see [YOrientedRectangle.boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData%23x">Online Documentation</a>
 */
open val x: Double
/**
 * Gets the y-coordinate of the upper-left corner of the label's bounding box.
 * @see [YOrientedRectangle.boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData%23y">Online Documentation</a>
 */
open val y: Double
/**
 * Specifies the coordinates of the upper-left corner of the bounding box of the label.
 * @param [x] the new x-coordinate of the upper-left corner
 * @param [y] the new y-coordinate of the upper-left corner
 * @see [x]
 * @see [y]
 * @see [YOrientedRectangle.boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData%23LabelLayoutData-method-setLocation">Online Documentation</a>
 */
 open   fun setLocation( x: Double ,
 y: Double )
/**
 * Specifies the width and height of the [oriented box][bounds] of this label.
 * @param [width] the width of the oriented box
 * @param [height] the height of the oriented box
 * @see [bounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutData%23LabelLayoutData-method-setSize">Online Documentation</a>
 */
 open   fun setSize( width: Double ,
 height: Double )

companion object : ClassMetadata<LabelLayoutData> {
}
}
