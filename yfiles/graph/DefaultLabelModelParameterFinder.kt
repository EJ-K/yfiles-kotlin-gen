// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata

/**
 * Implementation of the [ILabelModelParameterFinder] interface that uses the [ILabelModel]'s own [ILabelModelParameterProvider] instance to find the closest match.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelModelParameterFinder">Online Documentation</a>
 */
external open class DefaultLabelModelParameterFinder 
protected constructor () : ILabelModelParameterFinder {

/**
 * Calculates a metric for the given label/parameter pair and the target label layout.
 * @param [label] The label to apply the parameter to.
 * @param [layoutParameter] The parameter candidate.
 * @param [layout] The targeted layout rectangle.
 * @return A metric that indicates the distance between the candidate's layout and the target layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelModelParameterFinder%23DefaultLabelModelParameterFinder-method-calculateMetric">Online Documentation</a>
 */
 open protected   fun calculateMetric( label: ILabel ,
 layoutParameter: ILabelModelParameter ,
 layout: IOrientedRectangle ):Double
/**
 * Returns the distance between two [IOrientedRectangle] instances.
 * @param [rectangle1] The first geometry.
 * @param [rectangle2] The geometry to compare the first one with.
 * @return A value indicating the distance between the two instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelModelParameterFinder%23DefaultLabelModelParameterFinder-method-distance">Online Documentation</a>
 */
 final protected   fun distance( rectangle1: IOrientedRectangle ,
 rectangle2: IOrientedRectangle ):Double
/**
 * Tries to find a parameter that best matches the given layout for the provided label instance.
 * @param [label] The label to find a parameter for.
 * @param [model] The model instance to use. This should be the instance this instance has been obtained from.
 * @param [layout] The anticipated layout for the label.
 * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelModelParameterFinder%23DefaultLabelModelParameterFinder-method-findBestParameter">Online Documentation</a>
 */
 final override   fun findBestParameter( label: ILabel ,
 model: ILabelModel ,
 layout: IOrientedRectangle ):ILabelModelParameter
/**
 * Retrieves an enumerator over all candidates for a given label and model.
 * @param [label] The label.
 * @param [model] The model of the label.
 * @return An enumerator over the candidates. The enumerator may be empty.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelModelParameterFinder%23DefaultLabelModelParameterFinder-method-getCandidateParameters">Online Documentation</a>
 */
 open protected   fun getCandidateParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * Tries to find a parameter that best matches the given layout for the provided label instance among the set of given parameters.
 * @param [label] The label to find a parameter for.
 * @param [layout] The anticipated layout for the label.
 * @param [layoutParameters] A set of parameters to choose from.
 * @return A parameter that can be used for the label to approximate the provided layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelModelParameterFinder%23DefaultLabelModelParameterFinder-method-selectBestParameter">Online Documentation</a>
 */
 final   fun selectBestParameter( label: ILabel ,
 layout: IOrientedRectangle ,
 layoutParameters: IEnumerable<ILabelModelParameter> ):ILabelModelParameter?

companion object : ClassMetadata<DefaultLabelModelParameterFinder> {
/**
 * A singleton instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLabelModelParameterFinder%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: DefaultLabelModelParameterFinder
}
}
