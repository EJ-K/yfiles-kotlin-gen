// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import js.array.ReadonlyArray
import yfiles.lang.YObject

/**
 * This class provides convenience and transformation services for [IDataProvider]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders">Online Documentation</a>
 */
external object DataProviders {
/**
 * Returns a [IDataProvider] that returns the given value for each key.
 * @param [data] constant Object data returned by the created data provider.
 * @return a data provider view of a single value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createConstantDataProvider">Online Documentation</a>
 */
 final   fun <K : YObject, V : Any>createConstantDataProvider( data: V ):IDataProvider<K, V>
/**
 * Returns a [IDataProvider] view of an [Object] array defined for edges.
 * @param [data] array data for each edge of a static graph
 * @return a data provider view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createEdgeDataProvider">Online Documentation</a>
 */
 final   fun <V : Any>createEdgeDataProvider( data: ReadonlyArray<V> ):IDataProvider<Edge, V>
/**
 * Returns a [IDataProvider] view of a double, int, boolean and [Object] array defined for edges.
 * @param [doubleData] double data for each edge of a static graph
 * @param [intData] int data for each edge of a static graph
 * @param [boolData] boolean data for each edge of a static graph
 * @param [objectData] [Object] data for each edge of a static graph
 * @return a data provider view of the given arrays
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createEdgeDataProviderForArrays">Online Documentation</a>
 */
 final   fun <V : Any>createEdgeDataProviderForArrays( doubleData: ReadonlyArray<Double> ,
 intData: ReadonlyArray<Int> ,
 boolData: ReadonlyArray<Boolean> ,
 objectData: ReadonlyArray<V> ):IDataProvider<Edge, V>
/**
 * Returns a [IDataProvider] view of a boolean array defined for edges.
 * @param [data] array data for each edge of a static graph
 * @return a data provider view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createEdgeDataProviderForBoolean">Online Documentation</a>
 */
 final   fun createEdgeDataProviderForBoolean( data: ReadonlyArray<Boolean> ):IDataProvider<Edge, Boolean>
/**
 * Returns a [IDataProvider] view of an int array defined for edges.
 * @param [data] array data for each edge of a static graph
 * @return a data provider view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createEdgeDataProviderForInt">Online Documentation</a>
 */
 final   fun createEdgeDataProviderForInt( data: ReadonlyArray<Int> ):IDataProvider<Edge, Int>
/**
 * Returns a [IDataProvider] view of a double array defined for edges.
 * @param [data] array data for each edge of a static graph
 * @return a data provider view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createEdgeDataProviderForNumber">Online Documentation</a>
 */
 final   fun createEdgeDataProviderForNumber( data: ReadonlyArray<Double> ):IDataProvider<Edge, Double>
/**
 * Returns a [IDataProvider] that returns the negated boolean values provided by another data provider.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createNegatedDataProvider">Online Documentation</a>
 */
 final   fun <K : YObject>createNegatedDataProvider( data: IDataProvider<K, Boolean> ):IDataProvider<K, Boolean>
/**
 * Returns a [IDataProvider] view of an [Object] array defined for nodes.
 * @param [data] array data for each node of a static graph
 * @return a data provider view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createNodeDataProvider">Online Documentation</a>
 */
 final   fun <V : Any>createNodeDataProvider( data: ReadonlyArray<V> ):IDataProvider<Node, V>
/**
 * Returns a [IDataProvider] view of a boolean array defined for nodes.
 * @param [data] array data for each node of a static graph
 * @return a data provider view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createNodeDataProviderForBoolean">Online Documentation</a>
 */
 final   fun createNodeDataProviderForBoolean( data: ReadonlyArray<Boolean> ):IDataProvider<Node, Boolean>
/**
 * Returns a [IDataProvider] view of an int array defined for nodes.
 * @param [data] array data for each node of a static graph
 * @return a data provider view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createNodeDataProviderForInt">Online Documentation</a>
 */
 final   fun createNodeDataProviderForInt( data: ReadonlyArray<Int> ):IDataProvider<Node, Int>
/**
 * Returns a [IDataProvider] view of a double array defined for nodes.
 * @param [data] array data for each node of a static graph
 * @return a data provider view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createNodeDataProviderForNumber">Online Documentation</a>
 */
 final   fun createNodeDataProviderForNumber( data: ReadonlyArray<Double> ):IDataProvider<Node, Double>
/**
 * Returns a [IDataProvider] view of a double, int, boolean and [Object] array defined for nodes.
 * @param [doubleData] double data for each node of a static graph
 * @param [intData] int data for each node of a static graph
 * @param [boolData] boolean data for each node of a static graph
 * @param [objectData] [Object] data for each node of a static graph
 * @return a data provider view of the given arrays
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createNodeDataProviderWithArrays">Online Documentation</a>
 */
 final   fun <V : Any>createNodeDataProviderWithArrays( doubleData: ReadonlyArray<Double> ,
 intData: ReadonlyArray<Int> ,
 boolData: ReadonlyArray<Boolean> ,
 objectData: ReadonlyArray<V> ):IDataProvider<Node, V>
/**
 * Returns a [IDataProvider] for edges that return the data provider values bound to their source nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createSourceDataProvider">Online Documentation</a>
 */
 final   fun <V : Any>createSourceDataProvider( nodeData: IDataProvider<Node, V> ):IDataProvider<Edge, V>
/**
 * Returns a [IDataProvider] for edges that return the data provider values bound to their target nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DataProviders%23DataProviders-method-createTargetDataProvider">Online Documentation</a>
 */
 final   fun <V : Any>createTargetDataProvider( nodeData: IDataProvider<Node, V> ):IDataProvider<Edge, V>
}
