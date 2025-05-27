// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.YDimension
import yfiles.algorithms.YOrientedRectangle
import yfiles.algorithms.YPoint
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata

/**
 * An [EdgeLabelCandidate] describes one valid placement for an edge label considering the label model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelCandidate">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [EdgeLabelCandidate] described by its box, model parameter and internal flag.
 * @param [labelBox] the box that specifies the candidate's size and position
 * @param [param] the parameters of the label model associated with this candidate
 * @param [owner] the label associated with the candidate
 * @param [internal] `true` if the candidate is allowed to overlap with its owner, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelCandidate%23EdgeLabelCandidate-constructor-EdgeLabelCandidate(YOrientedRectangle,Object,IEdgeLabelLayout,boolean)">Online Documentation</a>
 */
external open class EdgeLabelCandidate  ( labelBox: YOrientedRectangle ,
 param: ILabelModelParameter ,
 owner: IEdgeLabelLayout ,
 internal: Boolean  = definedExternally) : LabelCandidate {
/**
 * Creates a new instance of [EdgeLabelCandidate] described by location, size, model parameter and internal flag.
 * @param [pos] the location of the upper left corner of the candidate
 * @param [size] the size of the candidate
 * @param [param] the parameters of the label model associated with this candidate
 * @param [owner] the label associated with the candidate
 * @param [internal] `true` if the candidate is allowed to overlap with its owner, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelCandidate%23EdgeLabelCandidate-constructor-EdgeLabelCandidate(YPoint,YDimension,Object,IEdgeLabelLayout,boolean)">Online Documentation</a>
 */
 constructor( pos: YPoint ,
 size: YDimension ,
 param: ILabelModelParameter ,
 owner: IEdgeLabelLayout ,
 internal: Boolean  = definedExternally)

companion object : ClassMetadata<EdgeLabelCandidate> {
}
}
