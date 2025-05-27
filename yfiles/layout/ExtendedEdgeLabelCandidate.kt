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
import yfiles.graph.ILabelCandidateDescriptor
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata

/**
 * An [EdgeLabelCandidate] that provides a [candidate descriptor][ILabelCandidateDescriptor].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExtendedEdgeLabelCandidate">Online Documentation</a>
 * 
 * @constructor Returns a new instance of [ExtendedEdgeLabelCandidate].
 * @param [pos] the location of the upper left corner of the candidate.
 * @param [size] the size of the candidate.
 * @param [param] the parameters of the labeling model associated with this candidate.
 * @param [owner] the label associated to the candidate.
 * @param [descriptor] the label candidate descriptor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExtendedEdgeLabelCandidate%23ExtendedEdgeLabelCandidate-constructor-ExtendedEdgeLabelCandidate(YPoint,YDimension,Object,IEdgeLabelLayout,ILabelCandidateDescriptor)">Online Documentation</a>
 */
external open class ExtendedEdgeLabelCandidate  ( pos: YPoint ,
 size: YDimension ,
 param: ILabelModelParameter ,
 owner: IEdgeLabelLayout ,
 descriptor: ILabelCandidateDescriptor? ) : EdgeLabelCandidate {
/**
 * Returns a new instance of [ExtendedEdgeLabelCandidate].
 * @param [orientedBox] the label size and orientation
 * @param [param] the parameters of the labeling model associated with this candidate.
 * @param [owner] the label associated to the candidate.
 * @param [internal] flag whether the candidate is allowed to overlap the layout of the edge.
 * @param [descriptor] the label candidate descriptor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExtendedEdgeLabelCandidate%23ExtendedEdgeLabelCandidate-constructor-ExtendedEdgeLabelCandidate(YOrientedRectangle,Object,IEdgeLabelLayout,boolean,ILabelCandidateDescriptor)">Online Documentation</a>
 */
 constructor( orientedBox: YOrientedRectangle ,
 param: ILabelModelParameter ,
 owner: IEdgeLabelLayout ,
 internal: Boolean ,
 descriptor: ILabelCandidateDescriptor? )
/**
 * Returns a new instance of [ExtendedEdgeLabelCandidate].
 * @param [pos] the location of the upper left corner of the candidate.
 * @param [size] the size of the candidate.
 * @param [param] the parameters of the labeling model associated with this candidate.
 * @param [owner] the label associated to the candidate.
 * @param [internal] flag whether the candidate is allowed to overlap the layout of the edge.
 * @param [descriptor] the label candidate descriptor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExtendedEdgeLabelCandidate%23ExtendedEdgeLabelCandidate-constructor-ExtendedEdgeLabelCandidate(YPoint,YDimension,Object,IEdgeLabelLayout,boolean,ILabelCandidateDescriptor)">Online Documentation</a>
 */
 constructor( pos: YPoint ,
 size: YDimension ,
 param: ILabelModelParameter ,
 owner: IEdgeLabelLayout ,
 internal: Boolean ,
 descriptor: ILabelCandidateDescriptor? )

/**
 * Gets the label candidate descriptor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExtendedEdgeLabelCandidate%23descriptor">Online Documentation</a>
 */
final val descriptor: ILabelCandidateDescriptor?

companion object : ClassMetadata<ExtendedEdgeLabelCandidate> {
}
}
