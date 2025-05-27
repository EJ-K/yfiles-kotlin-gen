// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * [LabelLayoutTranslator] automatically translates label layout information provided by the standard label layout classes [IEdgeLabelLayout] and [INodeLabelLayout] to layout data of type [LabelLayoutData] that is accessible by the keys defined in class [LabelLayoutKeys].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator">Online Documentation</a>
 * 
 * @constructor Creates a new [LabelLayoutTranslator] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23LabelLayoutTranslator-constructor-LabelLayoutTranslator">Online Documentation</a>
 */
external open class LabelLayoutTranslator  () : ILayoutStage {

/**
 * Gets or sets whether or not this stage should automatically flip edge label content depending on the label's rotation angle.
 * 
 * Default value - `true`. Labels are automatically flipped if they are upside down.
 * @see [LayoutGraphUtilities.autoFlipBox]
 * @see [ILabelLayout.orientedBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23autoFlipping">Online Documentation</a>
 */
open var autoFlipping: Boolean
/**
 * Gets or sets the core layout algorithm that is wrapped by this [ILayoutStage].
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23coreLayout">Online Documentation</a>
 */
override var coreLayout: ILayoutAlgorithm?
/**
 * Gets or sets whether or not to reset the orientation of edge labels.
 * 
 * Default value - `true`. The orientation of edge labels is reset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23resettingEdgeLabelOrientation">Online Documentation</a>
 */
open var resettingEdgeLabelOrientation: Boolean
/**
 * Gets or sets whether or not to reset the orientation of node labels.
 * 
 * Default value - `false`. The orientation of node labels is kept.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23resettingNodeLabelOrientation">Online Documentation</a>
 */
open var resettingNodeLabelOrientation: Boolean
/**
 * Gets or sets whether or not edge label information is translated.
 * 
 * Default value - `false`. The label information is not translated for edge labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23translateEdgeLabels">Online Documentation</a>
 */
open var translateEdgeLabels: Boolean
/**
 * Gets or sets whether or not node label information is translated.
 * 
 * Default value - `false`. The label information is not translated for node labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23translateNodeLabels">Online Documentation</a>
 */
open var translateNodeLabels: Boolean
/**
 * Gets or sets whether or not edge label information is written back to the model after core layout.
 * 
 * Default value - `true`. Edge label information is transferred back to the label model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23writeBackEdgeLabels">Online Documentation</a>
 */
open var writeBackEdgeLabels: Boolean
/**
 * Gets or sets whether or not node label information is written back to the model after the core layout.
 * 
 * Default value - `true`. Node label information is transferred back to the label model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23writeBackNodeLabels">Online Documentation</a>
 */
open var writeBackNodeLabels: Boolean
/**
 * Gets or sets whether or not edge label [boxes][LabelLayoutData.bounds] are interpreted relative to the edge when writing them back to the model.
 * 
 * Default value - `false`. Edge label boxes are interpreted absolute.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23writeBackRelativeEdgeLabelLocation">Online Documentation</a>
 */
open var writeBackRelativeEdgeLabelLocation: Boolean
/**
 * Gets or sets whether or not node label [bounds][LabelLayoutData.bounds] are interpreted relative to the node when writing them back to the model.
 * 
 * Default value - `false`. Node label boxes are interpreted absolute.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23writeBackRelativeNodeLabelLocation">Online Documentation</a>
 */
open var writeBackRelativeNodeLabelLocation: Boolean
/**
 * Translates traditional [ILabelLayout] information to [IDataProvider][yfiles.algorithms.IDataProvider]-based [LabelLayoutData].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutTranslator%23LabelLayoutTranslator-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<LabelLayoutTranslator> {
}
}

inline fun LabelLayoutTranslator(
    block: LabelLayoutTranslator.() -> Unit
): LabelLayoutTranslator {
    return LabelLayoutTranslator()
        .apply(block)
}
