// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IList
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.styles.IEdgeStyle
import yfiles.styles.ILabelStyle
import yfiles.styles.IPortStyle

/**
 * An abstract basic implementation of the [IFoldingEdgeConverter] interface that may be derived from to create a customized [FoldingManager.foldingEdgeConverter].
 * @see [DefaultFoldingEdgeConverter]
 * @see [FoldingManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase">Online Documentation</a>
 */
external abstract class FoldingEdgeConverterBase  : IFoldingEdgeConverter {

/**
 * Gets or sets a value indicating whether the [foldingEdgeStyle] instance should be assigned as a [ICloneable.clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23cloneEdgeStyle">Online Documentation</a>
 */
final var cloneEdgeStyle: Boolean
/**
 * Gets or sets a value indicating whether the [labelLayoutParameter] instance should be assigned as a [ICloneable.clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23cloneLabelLayoutParameter">Online Documentation</a>
 */
final var cloneLabelLayoutParameter: Boolean
/**
 * Gets or sets a value indicating whether the [labelStyle] instance should be assigned as a [ICloneable.clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23cloneLabelStyle">Online Documentation</a>
 */
final var cloneLabelStyle: Boolean
/**
 * Gets or sets a value indicating whether the [sourcePortLocationParameter] instance should be assigned as a [ICloneable.clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23cloneSourcePortLocationParameter">Online Documentation</a>
 */
final var cloneSourcePortLocationParameter: Boolean
/**
 * Gets or sets a value indicating whether the [sourcePortStyle] instance should be assigned as a [clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23cloneSourcePortStyle">Online Documentation</a>
 */
final var cloneSourcePortStyle: Boolean
/**
 * Gets or sets a value indicating whether the [targetPortLocationParameter] instance should be assigned as a [ICloneable.clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23cloneTargetPortLocationParameter">Online Documentation</a>
 */
final var cloneTargetPortLocationParameter: Boolean
/**
 * Gets or sets a value indicating whether the [targetPortStyle] instance should be assigned as a [ICloneable.clone][yfiles.lang.ICloneable.clone] or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23cloneTargetPortStyle">Online Documentation</a>
 */
final var cloneTargetPortStyle: Boolean
/**
 * Gets or sets a value indicating whether the first label of the [master edge][IFoldingView.getMasterItem] should be recreated for the folding edge.
 * @see [labelStyle]
 * @see [labelLayoutParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23copyFirstLabel">Online Documentation</a>
 */
final var copyFirstLabel: Boolean
/**
 * Gets or sets the [IEdgeStyle] to use for the folding edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23foldingEdgeStyle">Online Documentation</a>
 */
final var foldingEdgeStyle: IEdgeStyle?
/**
 * Gets or sets the [ILabelModelParameter] to use for the first label of the folding edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23labelLayoutParameter">Online Documentation</a>
 */
final var labelLayoutParameter: ILabelModelParameter?
/**
 * Gets or sets the [ILabelStyle] to use for the first label of the folding edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23labelStyle">Online Documentation</a>
 */
final var labelStyle: ILabelStyle?
/**
 * Gets or sets the [ILabelModelParameter] to use for the first label of the source or target port of folding edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23portLabelLayoutParameter">Online Documentation</a>
 */
final var portLabelLayoutParameter: ILabelModelParameter?
/**
 * Gets or sets the [ILabelStyle] to use for the first label at the source or target port of the folding edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23portLabelStyle">Online Documentation</a>
 */
final var portLabelStyle: ILabelStyle?
/**
 * Gets or sets a value indicating whether to reset and clear the bends of a folding edge initially.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23resetBends">Online Documentation</a>
 */
final var resetBends: Boolean
/**
 * Gets or sets the [IPortLocationModelParameter] to use for the source port of the folding edge.
 * @see [createSourcePortLocationParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23sourcePortLocationParameter">Online Documentation</a>
 */
final var sourcePortLocationParameter: IPortLocationModelParameter?
/**
 * Gets or sets the [IPortStyle] to use for the folding source port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23sourcePortStyle">Online Documentation</a>
 */
final var sourcePortStyle: IPortStyle?
/**
 * Gets or sets the [IPortLocationModelParameter] to use for the target port of the folding edge.
 * @see [createTargetPortLocationParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23targetPortLocationParameter">Online Documentation</a>
 */
final var targetPortLocationParameter: IPortLocationModelParameter?
/**
 * Gets or sets the [IPortStyle] to use for the folding target port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23targetPortStyle">Online Documentation</a>
 */
final var targetPortStyle: IPortStyle?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-addFoldingEdge">Online Documentation</a>
 */
 abstract override   fun addFoldingEdge( factory: IFoldingEdgeFactory ,
 foldingView: IFoldingView ,
 masterEdge: IEdge ,
 source: INode ,
 sourceIsCollapsed: Boolean ,
 target: INode ,
 targetIsCollapsed: Boolean ):IEdge?
/**
 * Creates the [IEdgeStyle] for use in [initializeFoldingEdgeStyle].
 * @param [foldingView] The folding view instance.
 * @param [foldingEdge] The folding edge in the view whose [IEdge.style] should be initialized.
 * @param [masterEdges] The edges that are being represented by the folding edge.
 * @return The [foldingEdgeStyle] or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [cloneEdgeStyle] property. This method may return `null` to indicate that the default style should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-createEdgeStyle">Online Documentation</a>
 */
 open protected   fun createEdgeStyle( foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> ):IEdgeStyle?
/**
 * Creates the [ILabelModelParameter] for use in [initializeFoldingEdgeLabels].
 * @param [foldingView] The folding view instance.
 * @param [localLabel] The local label in the view whose [ILabel.layoutParameter] should be initialized. May be `null` if the label layout parameter is requested for the label creation.
 * @param [masterLabel] The label that is being represented by the folding label.
 * @return The [labelLayoutParameter] (or [portLabelLayoutParameter] for port labels) or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [cloneLabelLayoutParameter] property. This method may return `null` to indicate that the default label layout parameter should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-createLabelLayoutParameter">Online Documentation</a>
 */
 open protected   fun createLabelLayoutParameter( foldingView: IFoldingView ,
 localLabel: ILabel? ,
 masterLabel: ILabel ):ILabelModelParameter?
/**
 * Creates the [ILabelStyle] for use in [initializeFoldingEdgeLabels].
 * @param [foldingView] The folding view instance.
 * @param [localLabel] The local label in the view whose [ILabel.style] should be initialized. May be `null` if the label style is requested for the label creation.
 * @param [masterLabel] The label that is being represented by the folding label.
 * @return The [labelStyle] (or [portLabelStyle] for port labels) or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [cloneLabelStyle] property. This method may return `null` to indicate that the default style should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-createLabelStyle">Online Documentation</a>
 */
 open protected   fun createLabelStyle( foldingView: IFoldingView ,
 localLabel: ILabel? ,
 masterLabel: ILabel ):ILabelStyle?
/**
 * Gets the preferred size for use in [initializeFoldingEdgeLabels] and [synchronizeLabels].
 * @param [masterLabel] The label that is being represented by the folding label.
 * @return The preferred size of the given label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-createPreferredLabelSize">Online Documentation</a>
 */
 open protected   fun createPreferredLabelSize( masterLabel: ILabel ):Size
/**
 * Creates the [IPortLocationModelParameter] of the source port for use in [initializeFoldingEdgePorts].
 * @param [foldingView] The folding view instance.
 * @param [localEdge] The local edge in the view whose source port's [IPort.locationParameter] should be initialized.
 * @param [masterEdges] The master edges that the folding edge represents.
 * @return The [sourcePortLocationParameter] or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [cloneSourcePortLocationParameter] property. This method may return `null` to indicate that the default port location parameter should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-createSourcePortLocationParameter">Online Documentation</a>
 */
 open protected   fun createSourcePortLocationParameter( foldingView: IFoldingView ,
 localEdge: IEdge ,
 masterEdges: IList<out IEdge> ):IPortLocationModelParameter?
/**
 * Creates the [IPortStyle] of the source port for use in [initializeFoldingEdgePorts].
 * @param [foldingView] The folding view instance.
 * @param [localEdge] The local edge in the view whose source port's [IPort.style] should be initialized.
 * @param [masterEdges] The master edges that the folding edge represents.
 * @return The [sourcePortStyle] or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [cloneSourcePortStyle] property. This method may return `null` to indicate that the default style should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-createSourcePortStyle">Online Documentation</a>
 */
 open protected   fun createSourcePortStyle( foldingView: IFoldingView ,
 localEdge: IEdge ,
 masterEdges: IList<out IEdge> ):IPortStyle?
/**
 * Creates the [IPortLocationModelParameter] of the target port for use in [initializeFoldingEdgePorts].
 * @param [foldingView] The folding view instance.
 * @param [localEdge] The local edge in the view whose target port's [IPort.locationParameter] should be initialized.
 * @param [masterEdges] The master edges that the folding edge represents.
 * @return The [targetPortLocationParameter] or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [cloneTargetPortLocationParameter] property. This method may return `null` to indicate that the default port location parameter should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-createTargetPortLocationParameter">Online Documentation</a>
 */
 open protected   fun createTargetPortLocationParameter( foldingView: IFoldingView ,
 localEdge: IEdge ,
 masterEdges: IList<out IEdge> ):IPortLocationModelParameter?
/**
 * Creates the [IPortStyle] of the target port for use in [initializeFoldingEdgePorts].
 * @param [foldingView] The folding view instance.
 * @param [localEdge] The local edge in the view whose target port's [IPort.style] should be initialized.
 * @param [masterEdges] The master edges that the folding edge represents.
 * @return The [targetPortStyle] or a [ICloneable.clone][yfiles.lang.ICloneable.clone] of it depending on the [cloneTargetPortStyle] property. This method may return `null` to indicate that the default style should not be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-createTargetPortStyle">Online Documentation</a>
 */
 open protected   fun createTargetPortStyle( foldingView: IFoldingView ,
 localEdge: IEdge ,
 masterEdges: IList<out IEdge> ):IPortStyle?
/**
 * Initializes the bends of the folding edge.
 * @param [state] The view state to change.
 * @param [foldingView] The folding view instance that has triggered the [initializeFoldingEdgeState] call.
 * @param [foldingEdge] The folding edge in the view that may be changed using the `state`.
 * @param [masterEdges] The master edges that the folding edge represents.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-initializeFoldingEdgeBends">Online Documentation</a>
 */
 open protected   fun initializeFoldingEdgeBends( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )
/**
 * Initializes the initial labels of the folding edge.
 * @param [state] The view state to change.
 * @param [foldingView] The folding view instance that has triggered the [initializeFoldingEdgeState] call.
 * @param [foldingEdge] The folding edge in the view that may be changed using the `state`.
 * @param [masterEdges] The master edges that the folding edge represents.
 * @see [labelStyle]
 * @see [labelLayoutParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-initializeFoldingEdgeLabels">Online Documentation</a>
 */
 open protected   fun initializeFoldingEdgeLabels( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )
/**
 * Initializes the ports of the folding edge.
 * @param [state] The view state to change.
 * @param [foldingView] The folding view instance that has triggered the [initializeFoldingEdgeState] call.
 * @param [foldingEdge] The folding edge in the view that may be changed using the `state`.
 * @param [masterEdges] The master edges that the folding edge represents.
 * @see [sourcePortStyle]
 * @see [targetPortStyle]
 * @see [sourcePortLocationParameter]
 * @see [targetPortLocationParameter]
 * @see [createSourcePortStyle]
 * @see [createTargetPortStyle]
 * @see [createSourcePortLocationParameter]
 * @see [createTargetPortLocationParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-initializeFoldingEdgePorts">Online Documentation</a>
 */
 open protected   fun initializeFoldingEdgePorts( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )
/**
 * Implements the [IFoldingEdgeConverter.initializeFoldingEdgeState] method and initializes the folding edge appearance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-initializeFoldingEdgeState">Online Documentation</a>
 */
 override   fun initializeFoldingEdgeState( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )
/**
 * Initializes the [style property][FoldingEdgeState.style] of the folding edge.
 * @param [state] The view state to change.
 * @param [foldingView] The folding view instance that has triggered the [initializeFoldingEdgeState] call.
 * @param [foldingEdge] The folding edge in the view that may be changed using the `state`.
 * @param [masterEdges] The master edges that the folding edge represents.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-initializeFoldingEdgeStyle">Online Documentation</a>
 */
 open protected   fun initializeFoldingEdgeStyle( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )
/**
 * Called by [updateFoldingEdgeState] to synchronize the first label if [copyFirstLabel] is enabled.
 * @param [state] The viewstate of the edge to change.
 * @param [foldingView] The folding view.
 * @param [foldingEdge] The folding edge.
 * @param [masterEdges] The master edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-synchronizeLabels">Online Documentation</a>
 */
 open protected   fun synchronizeLabels( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )
/**
 * Implements the [IFoldingEdgeConverter.updateFoldingEdgeState] method and changes the folding edge appearance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FoldingEdgeConverterBase%23FoldingEdgeConverterBase-method-updateFoldingEdgeState">Online Documentation</a>
 */
 override   fun updateFoldingEdgeState( state: FoldingEdgeState ,
 foldingView: IFoldingView ,
 foldingEdge: IEdge ,
 masterEdges: IList<out IEdge> )

companion object : ClassMetadata<FoldingEdgeConverterBase> {
}
}
